package com.baidu.hcm;


import org.junit.Test;

public class TestJunit {

	@Test
	public void test() {
		try {
			AssauserUtil.ifTrue(true, "����Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2() {
		try {
			AssauserUtil.ifTrue(false, "����Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test3() {
		try {
			AssauserUtil.ifObjNull(new String(), "���Զ���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		String str = null;
		try {
			AssauserUtil.ifObjNull(str, "���Զ���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test5() {
		String str = " a bc d ";
		try {
			AssauserUtil.ifStrNull(str, "�����ַ���������ֵ��ȥ���ո�󣬳��ȱ������ 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test6() {
		String str = "  ";
		try {
			AssauserUtil.ifStrNull(str, "�����ַ���������ֵ��ȥ���ո�󣬳��ȱ������ 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
