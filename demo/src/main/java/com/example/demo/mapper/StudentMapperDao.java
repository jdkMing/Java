package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

/**
 * 作者:黄晨明
 * 时间:2019年8月8日下午4:51:26
 * 
 */
public interface StudentMapperDao {
	public List<Map<String,Object>> getListAll();

	public List<Map<String, Object>> getListTypeAll();
}
