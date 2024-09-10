package com.jhi.ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ex05Application {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(Ex05Application.class,args);
	}

	// 인서트 하기전에 유효성 검사 validation jar 를 추가
	// ReqDto 유저 모델 데이터 추가
}
