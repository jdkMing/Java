package com.huangchenming.mapper;

import java.util.List;
import java.util.Map;

import com.huangchenming.shop.Shop;

/**
 * 作者:黄晨明
 * 时间:2019年7月9日上午8:45:08
 * 
 */
public interface ShopMapper {
//列表
	List<Map<String, Object>> getListAll(Map<String, Object> map);
//查询所有商品
	List<Map<String, Object>> getListGoods();
//查询具体的店铺
	List<Map<String, Object>> selectShop(int sid);
//添加店铺
	int addShop(Shop shop);
//添加中间表
	int addGosh(Map<String, Object> map);
//查看
	Shop ckShop(int sid);
//根据id查询本店铺的商品
	List<Integer> selectGosh(int sid);
//删除
	int deleteShop(Map<String, Object> map);
	
	int deletGosh(Map<String, Object> map);

}
