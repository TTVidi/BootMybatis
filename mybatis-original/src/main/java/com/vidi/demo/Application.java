package com.vidi.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 11:27
 * @Descripton :
 */
@SpringBootApplication
@MapperScan("com.vidi.demo.mybatis.dao")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}
