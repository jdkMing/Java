package com.baidu.hcm;

public class CRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CRuntimeException() {
		super();
	}
	/**
	 * 
	 * @param message ������Ϣ
	 * @param cause ����ԭ��
	 * @param enableSuppression�Ƿ���Լ�������
	 * @param writableStackTrace��ӡ������Ϣ�����ռ��
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
