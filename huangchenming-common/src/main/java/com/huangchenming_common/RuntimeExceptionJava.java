package com.huangchenming_common;
//�쳣��
public class RuntimeExceptionJava extends RuntimeException{

	private static final long serialVersionUID = 1L;
//�޲ι���
	public RuntimeExceptionJava() {
		super();
	}
	/**
	 * �вι���
	 * @param message������Ϣ
	 * @param cause�����ԭ��
	 * @param enableSuppression�Ƿ����ִ��
	 * @param writableStackTrace�Ƿ������Ӧ
	 */
	public RuntimeExceptionJava(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	/***
	 * �вι���
	 *@param message������Ϣ
	 * @param cause�����ԭ��
	 */
	public RuntimeExceptionJava(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	/**
	 * �вι���
	 * @param message������Ϣ
	 */
	public RuntimeExceptionJava(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param cause�����ԭ��
	 */
	public RuntimeExceptionJava(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
