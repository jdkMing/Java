package com.baidu.hcm;

import java.util.Collection;

public class AssertUtils {
	public static void isNull(String str,String message) {
		if(str==null||str.length()==0) {
			throw new CRuntimeException(message);
		}
	}
	public static void isANull(Collection<?> co,String message) {
		if(co==null||co.size()==0) {
			throw new CRuntimeException(message);
			
		}
	}
	
}
