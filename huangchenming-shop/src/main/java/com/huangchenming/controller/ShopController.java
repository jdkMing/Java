package com.huangchenming.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangchenming.service.ShopService;
import com.huangchenming.shop.Shop;

/**
 * 作者:黄晨明
 * 时间:2019年7月9日上午8:51:00
 * 
 */
@Controller
public class ShopController {
	@Resource
	ShopService service;
//	列表
	@RequestMapping("list")
	public String getListAll(Model model,
			@RequestParam(defaultValue="1")int pageNum,
			@RequestParam(defaultValue="")String mh
			){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("mh", mh);
		PageHelper.startPage(pageNum, 3);
		List<Map<String,Object>> list = service.getListAll(map);
		PageInfo<Map<String,Object>> page = new PageInfo<Map<String,Object>>(list);
		model.addAttribute("list", list);
		model.addAttribute("map", map);
		model.addAttribute("page", page);
		return "list";
	}
	
//	跳转到添加页面
	@RequestMapping("toadd")
	public String toadd(Model model){
		List<Map<String,Object>> list = service.getListGoods();
		model.addAttribute("list", list);
		return "add";
	}
//	删除
	@RequestMapping("delete")
	public String delete(int[] sid){
		int i  = service.delete(sid);
		return "redirect:list";
	}
//	查看
	@RequestMapping("ck")
	public String ck(int sid,Model model){
		Shop shop = service.ckShop(sid);
		List<Integer> li = service.selectGosh(sid);
		for (Integer integer : li) {
			System.out.println(integer+"....");
		}
		List<Map<String,Object>> list = service.getListGoods();
		model.addAttribute("list", list);
		model.addAttribute("shop", shop);
		model.addAttribute("li", li);
		return "ck";
	}
//	查看
	@RequestMapping("selectShop")
	@ResponseBody
	public Object selectShop(int sid){
		List<Map<String,Object>> list = service.selectShop(sid);
		return list.size();
	}
//	添加
	@RequestMapping("add")
	@ResponseBody
	public Object addShop(int[] gids,Shop shop){
		int i = service.addShop(gids,shop);
		return i;
	}
	
	
}
