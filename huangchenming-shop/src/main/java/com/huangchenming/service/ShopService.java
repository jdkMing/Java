package com.huangchenming.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huangchenming.mapper.ShopMapper;
import com.huangchenming.shop.Shop;

/**
 * 作者:黄晨明
 * 时间:2019年7月9日上午8:48:00
 * 
 */
@Service
public class ShopService {
	@Resource
	ShopMapper mapper;
//列表
	public List<Map<String, Object>> getListAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.getListAll(map);
	}
//查询所有的商品
	public List<Map<String, Object>> getListGoods() {
		// TODO Auto-generated method stub
		return mapper.getListGoods();
	}
//查询具体商铺
	public List<Map<String, Object>> selectShop(int sid) {
		// TODO Auto-generated method stub
		return mapper.selectShop(sid);
	}
//添加商铺
	public int addShop(int[] gids, Shop shop) {
		int i = mapper.addShop(shop);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("sid", shop.getSid());
		map.put("gids", gids);
		return mapper.addGosh(map);
	}
//查看店铺
	public Shop ckShop(int sid) {
		// TODO Auto-generated method stub
		return mapper.ckShop(sid);
	}
//查询所有的商品id
	public List<Integer> selectGosh(int sid) {
		// TODO Auto-generated method stub
		return mapper.selectGosh(sid);
	}
//删除
	public int delete(int[] sid) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("sid", sid);
		int i = mapper.deleteShop(map);
		int j = mapper.deletGosh(map);
		return i;
	}
}
