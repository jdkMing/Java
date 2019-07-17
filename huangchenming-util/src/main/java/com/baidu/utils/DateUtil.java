package com.baidu.utils;

import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * 作者:黄晨明
 * 时间:2019年7月17日上午10:26:07
 */
public class DateUtil {
//	方法1：根据传入的日期获取年龄
	public static int getAge (Date src) {
		Date date = new Date();
		int nian = date.getYear()+1900;
		int nian2 = src.getYear();
		int i = nian-nian2;
		if(date.getMonth()+1 < src.getMonth()) {
			i=i-1;
		}else if(date.getMonth()+1 == src.getMonth()&&date.getDate()<src.getDate()){
			i = i-1;
		}else {
			i=i;
		}
		return i;
	}

//	方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	//示例:
	public static Date getDateByMonthInit (Date src) {
		Date date = new Date(src.getYear(),src.getMonth(),01,00,00,00);
		return date;
	}

//	方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static Date getDateByMonthLast(Date src) {
		int nian = src.getYear()+1900;
		int yue = src.getMonth()+1;
		int data=0;
		if(nian%4==0) {
			data=29;
		}else if(yue==1||yue==3||yue==5||yue==7||yue==8||yue==10||yue==12) {
			data = 31;
		}else if(yue==2){
			data = 28;
		}else {
			data = 30;
		}
		Date date = new Date(src.getYear(),src.getMonth(),data,23,59,59);
		return date;
	}

//	方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) throws Exception {
		Date date = new Date();
		if(future.compareTo(date)==0) {
			throw new Exception("未来日期必须大于现在的日期");
		}
		
		int i = future.getDate();
		int j = date.getDate();
		int c = i-j;
		return c;
	}

//	方法5：求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date future) throws Exception {
		Date date = new Date();
		if(future.compareTo(date)==0) {
			throw new Exception("过去的日期必须小于大于现在的日期");
		}
		
		int i = future.getDate();
		int j = date.getDate();
		int c = j-i;
		return c;
	}
}
