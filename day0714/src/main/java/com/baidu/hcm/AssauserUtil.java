package com.baidu.hcm;

public class AssauserUtil {
//	(1) 断言为真（就是表达结果或参数必须为真，否则抛出自己的自定义异常）；
	public static void ifTrue(Boolean flag,String message) {
		if(!flag) {
			throw new RuntimeJava(message);
		}
	}
//	断言对象不为空
	public static void ifObjNull(Object obj,String message) {
		if(obj==null) {
			throw new RuntimeJava(message);
		}
	}
//	断言字符串必须有值，去掉空格后，长度必须大于 0
	public static void ifStrNull(String str,String message) {
		if(str.replaceAll(" ", "").length()==0) {
			throw new RuntimeJava(message);
		}
	}

}
