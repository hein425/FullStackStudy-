package com.jhi.ex01.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 객체 담는 통이라고 정의
@ComponentScan( basePackages = "com.jhi.ex01.member")
public class Myconf1 {


}
