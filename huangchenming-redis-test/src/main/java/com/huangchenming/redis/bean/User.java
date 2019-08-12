package com.huangchenming.redis.bean;

import java.io.Serializable;

/**
 * 作者:黄晨明
 * 时间:2019年8月12日上午8:43:06
 * 
 */
//User类
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
//	ID
	private int id;
//	姓名
	private String name;
//	性别
	private String sex;
//	手机
	private String phone;
//	邮箱
	private String emil;
//	生日
	private String datea;
//	getSet
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
//	重写hashCode()和equals(Object obj)方法
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datea == null) ? 0 : datea.hashCode());
		result = prime * result + ((emil == null) ? 0 : emil.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
//	重写hashCode()和equals(Object obj)方法
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (datea == null) {
			if (other.datea != null)
				return false;
		} else if (!datea.equals(other.datea))
			return false;
		if (emil == null) {
			if (other.emil != null)
				return false;
		} else if (!emil.equals(other.emil))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
//	无参构造
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
//	有参构造
	public User(int id, String name, String sex, String phone, String emil, String datea) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.emil = emil;
		this.datea = datea;
	}
//	toString
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", emil=" + emil + ", datea="
				+ datea + "]";
	}
	
}
