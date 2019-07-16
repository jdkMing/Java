package com.bawei.common.utils;

import java.util.Calendar;

/**
 * 日期工具类
 * @author zhaoming.li
 *
 */
public class DateUtil {
	
	private DateUtil() {}
	
	public static int ageFromToday(Calendar birthday) {
		
		// 输入参数合法性判断
		if(birthday == null) {
			throw new IllegalArgumentException("生日参数不能为空");
		}
		
		Calendar now = Calendar.getInstance();
		
		if (birthday.compareTo(now)>0) {
			throw new IllegalArgumentException("生日参数不能超出当前日期");
		}
		
		// 年龄计算的处理
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH);
		int nowDate = now.get(Calendar.DATE);
		
		int birthYear = birthday.get(Calendar.YEAR);
		int birthMonth = birthday.get(Calendar.MONTH);
		int birthDate = birthday.get(Calendar.DATE);
		
		int age = nowYear - birthYear;
		
		if (birthMonth > nowMonth) {
			age--;
		} else if(birthMonth == nowMonth) {
			if (birthDate > nowDate) {
				age--;
			}
		}
		
		return age;
	}
}
