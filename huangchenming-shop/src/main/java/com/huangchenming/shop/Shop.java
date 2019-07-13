package com.huangchenming.shop;
/**
 * 作者:黄晨明
 * 时间:2019年7月9日上午8:45:56
 * 
 */
public class Shop {
	private int sid;
	private String sname;
	private String sdate;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", sdate=" + sdate
				+ "]";
	}
	
}
