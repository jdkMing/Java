package com.huangchenming.redis.test;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.bawei.common.utils.StringUtil;
import com.huangchenming.redis.bean.User;

/**
 * 作者:黄晨明
 * 时间:2019年8月12日上午8:47:50
 * 
 */
public class UserRedisTest {
	
	/**
	 * (1)ID使用1-10万序号。（2分） (2)姓名使用3个随机汉字模拟，可以使用以前自己编写的工具方法。（4分） (3)性别在女和男两个值中随机。（4分）
	 * (4)手机以13开头+9位随机数模拟。（4分）
	 * (5)邮箱以3-20个随机字母+@qq.com、@163.com、@sian.com、@gmail.com、@sohu.com、@hotmail.com模拟。（4分）
	 * (6)生日要模拟18-70岁之间。（4分）
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	public void userRedisTest() throws UnsupportedEncodingException {
		for (int i = 0; i < 100000; i++) {
			int id = i+1;
			String name = StringUtil.randomChineseString(3);
			String sex = null;
			if(StringUtil.randomLong(0, 1)/2%2==0) {
				sex = "男";
			}else {
				sex = "女";
			}
			
			String phone = StringUtil.randomLong(13, 9)+"";
			String emil = emil();
			User user = null;
			String datea = datea();
			user = new User(id,name,sex,phone,emil,datea);
			System.out.println(user);
		}
	}
	
	
//	邮箱
	public String emil() {
		String emil = "sfsfwd";
		int lean = Integer.parseInt(StringUtil.randomLong(0,1)+"");
		if(lean>=3&&lean<=20) {
			emil = StringUtil.randomString(lean);
		}else {
			emil();
		}
		if(lean%2==0) {
			emil = emil+"@qq.com";
		}else if(lean%2==1) {
			emil = emil+"@163.com";
		}else {
			emil = emil+"@sian.com";
		}
		return emil;
	}
//	生日
	public String datea() {
		String datea = StringUtil.randomLong(0, 2)+"";
		if(Integer.parseInt(datea)>=70||Integer.parseInt(datea)<=18) {
			datea();
		}
		return datea;
	}
	
	
}
