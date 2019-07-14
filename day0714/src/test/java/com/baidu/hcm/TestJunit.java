package com.baidu.hcm;


import org.junit.Test;

public class TestJunit {

	@Test
	public void test() {
		try {
			AssauserUtil.ifTrue(true, "断言为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2() {
		try {
			AssauserUtil.ifTrue(false, "断言为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test3() {
		try {
			AssauserUtil.ifObjNull(new String(), "断言对象不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		String str = null;
		try {
			AssauserUtil.ifObjNull(str, "断言对象不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test5() {
		String str = " a bc d ";
		try {
			AssauserUtil.ifStrNull(str, "断言字符串必须有值，去掉空格后，长度必须大于 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test6() {
		String str = "  ";
		try {
			AssauserUtil.ifStrNull(str, "断言字符串必须有值，去掉空格后，长度必须大于 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
