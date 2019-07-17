package com.baidu.utils;

import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * ����:�Ƴ���
 * ʱ��:2019��7��17������10:26:07
 */
public class DateUtil {
//	����1�����ݴ�������ڻ�ȡ����
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

//	����2�����ݴ���Ĳ�����ȡ�����ڵ��³����ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-01 00:00:00��
	//ʾ��:
	public static Date getDateByMonthInit (Date src) {
		Date date = new Date(src.getYear(),src.getMonth(),01,00,00,00);
		return date;
	}

//	����3 :���ݴ���Ĳ�����ȡ����������ĩ���ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-30 23:59:59����ע���´���С�Լ����ꡣ
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

//	����4����δ����������컹ʣ������
	//ʾ��:
	public static int getDaysByFuture (Date future) throws Exception {
		Date date = new Date();
		if(future.compareTo(date)==0) {
			throw new Exception("δ�����ڱ���������ڵ�����");
		}
		
		int i = future.getDate();
		int j = date.getDate();
		int c = i-j;
		return c;
	}

//	����5�����ȥ����������ȥ������
	public static int getDaysByDeparted (Date future) throws Exception {
		Date date = new Date();
		if(future.compareTo(date)==0) {
			throw new Exception("��ȥ�����ڱ���С�ڴ������ڵ�����");
		}
		
		int i = future.getDate();
		int j = date.getDate();
		int c = j-i;
		return c;
	}
}
