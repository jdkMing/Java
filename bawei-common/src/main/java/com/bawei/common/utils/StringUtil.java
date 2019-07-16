package com.bawei.common.utils;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * 
 * @author zhaoming.li
 *
 */
public class StringUtil {
	
	private StringUtil() {}
	
	/**
	 * 判断某个字符串是否为NULL或空串
	 * @param src 源字符串
	 * @return 当前src为null或空串时，返回false
	 */
	public static boolean isNotBlank(String src) {
		boolean result = false;
		
		result = src!=null && !"".equals(src);
		
		return result;
	}
	
	/**
	 * 判断某个字符串是否为NULL或空串，以及所有的字符是否都为空格
	 * @param src 源字符串
	 * @return 当前src为null或空串，或全部为空格时，返回false
	 */
	public static boolean isNotEmpty(String src) {
		boolean result = false;
		
		if(!isNotBlank(src)) {
			return false;
		};
		
		char[] chars = src.toCharArray();
		
		for (char e : chars) {
			if (e != ' ') {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	
	public static String randomString(int length) {
		StringBuffer buffer = new StringBuffer();
		
		for (int i=0; i<length; i++) {
			char randomCharacter = (char) ((char)(Math.random()*26)+65);
			if (Math.random() > 0.5) {
				randomCharacter+=(char)32;
			}
			buffer.append(randomCharacter);
		}
		
		return buffer.toString();
	}
	
	public static String randomChineseString(int length) {
		StringBuffer buffer = new StringBuffer();
		int start = Integer.valueOf("4e00", 16);
		int end = Integer.valueOf("9fa5", 16);
		
		for (int i=0; i<length; i++) {
			char randomCharacter = (char) ((char)(Math.random()*(end-start+1))+start);
			buffer.append(randomCharacter);
		}
		
 		return buffer.toString();
	}
	
	
}
