package com.jhi.ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex04Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex04Application.class, args);
	}

	// 인서트 하기전에 유효성 검사 validation jar 를 추가
	// ReqDto 유저 모델 데이터 추가
}
