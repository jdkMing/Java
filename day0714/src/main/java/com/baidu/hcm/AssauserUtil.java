package com.baidu.hcm;

public class AssauserUtil {
//	(1) ����Ϊ�棨���Ǳ�������������Ϊ�棬�����׳��Լ����Զ����쳣����
	public static void ifTrue(Boolean flag,String message) {
		if(!flag) {
			throw new RuntimeJava(message);
		}
	}
//	���Զ���Ϊ��
	public static void ifObjNull(Object obj,String message) {
		if(obj==null) {
			throw new RuntimeJava(message);
		}
	}
//	�����ַ���������ֵ��ȥ���ո�󣬳��ȱ������ 0
	public static void ifStrNull(String str,String message) {
		if(str.replaceAll(" ", "").length()==0) {
			throw new RuntimeJava(message);
		}
	}

}
