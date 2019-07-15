package com.huangchenming_common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

import com.huangchenming_common.RuntimeExceptionJava;

//���Թ�����
public class AssertUtil {
	//����1������Ϊ�棬���Ϊ�٣����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isTrue(boolean condition, String message){
		if(!condition) {
			throw new RuntimeExceptionJava(message);
		}
	}
	//����2������Ϊ�٣����Ϊ�棬���׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isFalse(boolean condition, String message){
		if(condition) {
			throw new RuntimeExceptionJava(message);
		}
	}
	//����3�����Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notNull(Object obj, String message){
		if(obj==null||obj.toString().length()==0) {
			throw new RuntimeExceptionJava(message);
		}
	}
	//����4�����Զ������գ������Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isNull(Object obj, String message){
		if(obj!=null) {
			throw new RuntimeExceptionJava(message);
		}
	}
	//����5�����Լ��ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notEmpty(Collection<?> coll, String message){
	if(coll.size()==0||coll==null) {
		throw new RuntimeExceptionJava(message);
		}
	}
	//����6������Map���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notEmpty(Map<?,?> map, String message){
		if(map.keySet().size()==0||map==null) {
			throw new RuntimeExceptionJava(message);
		}
	}
	//����7�������ַ���������ֵ��ȥ���ո�Ȼ���ж��ַ��������Ƿ����0�����ûֵ�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void hasText(String condition, String message){
		if(condition.replaceAll(" ", "").length()==0) {
			throw new RuntimeExceptionJava(message);
		}
	}
	//����8������ֵ�������0�����С�ڻ����0�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void greaterThanZero(BigDecimal value, String message){
		if(value.doubleValue()<=0) {
			throw new RuntimeExceptionJava(message);
		}
	}
}
