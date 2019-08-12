package com.huangchenming.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.common.utils.StringUtil;
import com.huangchenming.redis.bean.User;

/**
 * 作者:黄晨明 时间:2019年8月12日上午9:28:06
 * 
 */
@Controller
public class UserController {

	@Resource
	RedisTemplate<String, Object> redisTemplate;

	/**
	 * (1)进入Redis客户端命令界面，使用命令清空所有数据库数据。（2分）
	 * (2)在Spring容器中配置RedisTemplate。key系列化器StringRedisSerializer。value系列化器为JdkSerializationRedisSerializer。（4分）
	 * (3)使用RedisTemplate保存上述模拟的十万个user对象到Redis。（4分）
	 * (4)保存完成后，输出系列化方式、保存数量、所耗时间三项数据，并将这三项数据复制到记事本中。（4分）
	 * (5)进入Redis客户端命令界面，使用命令显示数据量（2分）。使用命令显示几条数据（2分）。
	 * 
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("testJdk")
	public void testJdk() throws UnsupportedEncodingException {
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		long p = System.currentTimeMillis();
		ValueOperations<String, Object> value = redisTemplate.opsForValue();
		for (int i = 0; i < 100000; i++) {
			int id = i + 1;
			String name = StringUtil.randomChineseString(3);
			String sex = null;
			if (StringUtil.randomLong(0, 1) / 2 % 2 == 0) {
				sex = "男";
			} else {
				sex = "女";
			}

			String phone = StringUtil.randomLong(13, 9) + "";
			String emil = emil();
			User user = null;
			String datea = datea();
			user = new User(id, name, sex, phone, emil, datea);
			value.set(i + "", user);
		}
		long l = System.currentTimeMillis();
		System.out.println("JDK系列化方式保存十万个user随机对象到Redis---耗时" + (l - p));
	}

	/**
	 * (1)进入Redis客户端命令界面，使用命令清空所有数据库数据。（2分）
	 * (2)在Spring容器中配置RedisTemplate。key系列化器StringRedisSerializer。value系列化器为Jackson2JsonRedisSerializer。（4分）
	 * (3)使用RedisTemplate保存上述模拟的十万个user对象到Redis。（4分）
	 * (4)保存完成后，输出系列化方式、保存数量、所耗时间三项数据，并将这三项数据复制到记事本中。（4分）
	 * (5)进入Redis客户端命令界面，使用命令显示数据量（2分）。使用命令显示几条数据（2分）。
	 * 
	 * 
	 */
	@RequestMapping("testJson")
	public void testJson() throws UnsupportedEncodingException {
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(User.class));
		long p = System.currentTimeMillis();
		ValueOperations<String, Object> value = redisTemplate.opsForValue();
		for (int i = 0; i < 100000; i++) {
			int id = i + 1;
			String name = StringUtil.randomChineseString(3);
			String sex = null;
			if (StringUtil.randomLong(0, 1) / 2 % 2 == 0) {
				sex = "男";
			} else {
				sex = "女";
			}

			String phone = StringUtil.randomLong(13, 9) + "";
			String emil = emil();
			User user = null;
			String datea = datea();
			user = new User(id, name, sex, phone, emil, datea);
			value.set(i + "", user);
		}
		long l = System.currentTimeMillis();
		System.out.println("使用JSON系列化方式保存十万个user随机对象到Redis---耗时" + (l - p));
	}

	/**
	 * 
	 * 
	 * 6.使用Redis的Hash类型保存十万个user随机对象到Redis，并计算耗时（18分）
	 * (1)进入Redis客户端命令界面，使用命令清空所有数据库数据。（2分）
	 * (2)在Spring容器中配置RedisTemplate。key系列化器StringRedisSerializer。hashKey系列化器StringRedisSerializer，hashValue系列化器StringRedisSerializer。（4分）
	 * (3)使用RedisTemplate以hash类型保存上述模拟的十万个user对象到Redis。（4分）
	 * (4)保存完成后，输出系列化方式、保存数量、所耗时间三项数据，并将这三项数据复制到记事本中。（4分）
	 * (5)进入Redis客户端命令界面，使用命令显示数据量（2分）。使用命令显示几条数据（2分）。
	 */
	@RequestMapping("testHash")
	public void testHash() throws UnsupportedEncodingException {
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		long p = System.currentTimeMillis();
		HashOperations<String, Object, Object> value = redisTemplate.opsForHash();
		for (int i = 0; i < 100000; i++) {
			int id = i + 1;
			String name = StringUtil.randomChineseString(3);
			String sex = null;
			if (StringUtil.randomLong(0, 1) / 2 % 2 == 0) {
				sex = "男";
			} else {
				sex = "女";
			}

			String phone = StringUtil.randomLong(13, 9) + "";
			String emil = emil();
			User user = null;
			String datea = datea();
			user = new User(id, name, sex, phone, emil, datea);
			value.put(id+"", "hash", user.toString());
		}
		long l = System.currentTimeMillis();
		System.out.println("使用Redis的Hash类型保存十万个user随机对象到Redis" + (l - p));
	}
	// 邮箱
	public String emil() {
		String emil = "sfsfwd";
		int lean = Integer.parseInt(StringUtil.randomLong(0, 1) + "");
		if (lean >= 3 && lean <= 20) {
			emil = StringUtil.randomString(lean);
		} else {
			emil();
		}
		if (lean % 2 == 0) {
			emil = emil + "@qq.com";
		} else if (lean % 2 == 1) {
			emil = emil + "@163.com";
		} else {
			emil = emil + "@sian.com";
		}
		return emil;
	}

	// 生日
	public String datea() {
		String datea = StringUtil.randomLong(0, 2) + "";
		if (Integer.parseInt(datea) >= 70 || Integer.parseInt(datea) <= 18) {
			datea();
		}
		return datea;
	}

}
