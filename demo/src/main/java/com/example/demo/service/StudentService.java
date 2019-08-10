package com.example.demo.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentMapperDao;


/**
 * 作者:黄晨明
 * 时间:2019年8月8日下午4:33:51
 * 
 */
@Service
public class StudentService {
	@Resource
	StudentMapperDao dao;
	
	public List<Map<String,Object>> getListAll(){
		return dao.getListAll();
	}

	public List<Map<String, Object>> getListTypeAll() {
		// TODO Auto-generated method stub
		return dao.getListTypeAll();
	}
}
