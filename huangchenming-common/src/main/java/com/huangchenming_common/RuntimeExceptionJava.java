package com.huangchenming_common;
//异常类
public class RuntimeExceptionJava extends RuntimeException{

	private static final long serialVersionUID = 1L;
//无参构造
	public RuntimeExceptionJava() {
		super();
	}
	/**
	 * 有参构造
	 * @param message错误信息
	 * @param cause错误的原因
	 * @param enableSuppression是否可以执行
	 * @param writableStackTrace是否可以响应
	 */
	public RuntimeExceptionJava(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	/***
	 * 有参构造
	 *@param message错误信息
	 * @param cause错误的原因
	 */
	public RuntimeExceptionJava(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 有参构造
	 * @param message错误信息
	 */
	public RuntimeExceptionJava(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param cause错误的原因
	 */
	public RuntimeExceptionJava(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
