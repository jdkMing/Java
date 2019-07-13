package com.huangchenming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者:黄晨明
 * 时间:2019年7月9日上午8:48:59
 * 
 */
@SpringBootApplication
@MapperScan("com.huangchenming.mapper")
public class MySpring{
	public static void main(String[] args) {
		SpringApplication.run(MySpring.class, args);
	}
}
