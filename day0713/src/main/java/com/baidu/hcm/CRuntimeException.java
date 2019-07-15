package com.baidu.hcm;

public class CRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CRuntimeException() {
		super();
	}
	/**
	 * 
	 * @param message 错误信息
	 * @param cause 错误原因
	 * @param enableSuppression是否可以继续启动
	 * @param writableStackTrace打印错误消息到这个占中
	 */
	public CRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CRuntimeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
