package com.example.demo.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.GoodsMapperDao;

/**
 * 作者:黄晨明
 * 时间:2019年8月9日下午4:08:04
 * 
 */
@Service
public class GoodsService {
	
	@Resource
	GoodsMapperDao dao;

	public List<Map<String, Object>> getList() {
		// TODO Auto-generated method stub
		return dao.getList();
	}
}
