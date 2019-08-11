package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.GoodsService;

/**
 * 作者:黄晨明
 * 时间:2019年8月9日下午4:06:42
 * 
 */
@Controller
public class GoodsController {
	
	@Resource
	GoodsService service;
	
	@Resource
	StringRedisTemplate stringRedisTemplate;
	
	@Resource
	RedisTemplate<String, Object> redisTemplate;
	
	
	@GetMapping("toLogin")
	public ModelAndView toLogin() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	
	@PostMapping("login")
	public ModelAndView login(@RequestParam(defaultValue="")String name,
			@RequestParam(defaultValue="")String pwd) {
		ModelAndView mav = new ModelAndView();
		HashOperations<String, Object, Object> hash = stringRedisTemplate.opsForHash();
		Object obj = hash.get("l", name);
		System.out.println(obj);
		if(pwd.equals(obj+"")) {
			mav.setViewName("redirect:list");
		}else {
			mav.setViewName("redirect:toLogin");
		}
		return mav;
	}
	
	@RequestMapping("list")
	public ModelAndView getGoodsListAll() {
		ModelAndView mav = new ModelAndView("list");
		ListOperations<String, Object> list = redisTemplate.opsForList();
		List<Object> lis = list.range("listGoods", 0, -1);
		if(lis.size()==0) {
			List<Map<String,Object>> li = service.getList();
			for (Map<String, Object> map : li) {
				list.rightPush("listGoods", map);
			}
			mav.addObject("list", li);
			
		}else {
			mav.addObject("list", lis);
		}
		
		return mav;
	}
	
	@ResponseBody
	@RequestMapping("redismiaosha")
	public Boolean getGoods(int id) {
		ListOperations<String, Object> list = redisTemplate.opsForList();
		List<Object> lis = list.range("listGoods", 0, -1);
		for (int i = 0; i < lis.size(); i++) {
			@SuppressWarnings("unchecked")
			Map<String,Object> goods = (Map<String, Object>) lis.get(i);
			if(Integer.parseInt(""+goods.get("id"))==id) {
				goods.put("num",Integer.parseInt(""+goods.get("num"))- 1);
				list.set("listGoods", i, goods);
				return true;
			}
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping("getCount")
	public List getCount() {
		ModelAndView mav = new ModelAndView();
		ListOperations<String, Object> list = redisTemplate.opsForList();
		List<Object> lis = list.range("listGoods", 0, -1);
		return lis;
	}
	
	
}
