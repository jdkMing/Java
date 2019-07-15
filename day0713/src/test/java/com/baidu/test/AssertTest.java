package com.baidu.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.baidu.hcm.AssertUtils;

public class AssertTest {

	@Test
	public void Test() {
		String str= "";
		try {
			AssertUtils.isNull(str, "函数为null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void Test2() {
		List<Integer> list =  new ArrayList<Integer>();
		list.add(1);
		try {
			AssertUtils. isANull(list, "集合不能为空");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
