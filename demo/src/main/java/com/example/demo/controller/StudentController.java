package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.StudentService;

/**
 * 作者:黄晨明 时间:2019年8月8日下午4:33:20
 * 
 */
@Controller
public class StudentController {
	@Resource
	StudentService service;

	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	@Autowired(required = false)
	public void setRedisTemplate(RedisTemplate redisTemplate) {
	    RedisSerializer stringSerializer = new StringRedisSerializer();
	    redisTemplate.setKeySerializer(stringSerializer);
	    redisTemplate.setValueSerializer(stringSerializer);
	    redisTemplate.setHashKeySerializer(stringSerializer);
	    redisTemplate.setHashValueSerializer(stringSerializer);
	    this.redisTemplate = redisTemplate;
	}
	
	@RequestMapping("list")
	public String getList(Model model) {
		
		List<Map<String, Object>> list = service.getListAll();

		// 获取模板对象中操作list的对象
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		
		// 先到redis中查key为brandList
		List<Object> range = opsForList.range("brandList", 0, -1);
		
		List<Map<String, Object>> brandList = null;
		
		if (range.size() == 0) {
			
			// 缓存中没有数据从mysql中查询班级集合
			brandList = service.getListTypeAll();
			
			for (Map<String, Object> map : brandList) {
				
				// 循环放入redis的list
				opsForList.leftPush("brandList", map.toString());
				
			}
			
			model.addAttribute("ty", brandList);
			

		} else {
			
			model.addAttribute("ty", range);
			
		}

		model.addAttribute("list", list);
		
		return "list";
	}
	
	@GetMapping("login")
	public String toLogin() {
		
		return "login";
		
	}
	
	
	
	@PostMapping("login")
	public String login(@RequestParam(defaultValue="")String name,@RequestParam(defaultValue="")String pwd) {
	
		
		HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
		String object = (String) hash.get("l", name);
		
		if((object).equals(pwd)) {
			
			return "redirect:list";
			
		}else {
			
			return "login";
			
		}
	}
}
