package com.baidu.test;


import java.util.Date;

import org.junit.Test;

import com.baidu.utils.DateUtil;

/**
 * 作者:黄晨明
 * 时间:2019年7月17日上午10:26:29
 */
public class DateUtilTest {

	@Test
	public void test() {
		System.out.println(DateUtil.getAge(new Date(1998,07,17)));
	}
	@Test
	public void test2() {
		System.out.println(DateUtil.getDateByMonthInit(new Date()).toLocaleString());
	}
	@Test
	public void test3() {
		System.out.println(DateUtil.getDateByMonthLast(new Date()).toLocaleString());
	}
	@Test
	public void test4() throws Exception {
		System.out.println(DateUtil.getDaysByFuture(new Date(2019,07,18)));
	}
	@Test
	public void test5() throws Exception {
		System.out.println(DateUtil.getDaysByDeparted(new Date(2019,07,16)));
	}

}
