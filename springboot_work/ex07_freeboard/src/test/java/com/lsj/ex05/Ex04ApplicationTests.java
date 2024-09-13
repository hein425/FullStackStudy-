package com.lsj.ex05;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class Ex04ApplicationTests {

	@Test
	void contextLoads() {

		String [] str = {"10입니다","20입니다","30입니다."};
		Arrays.stream(str).forEach(System.out::println);

		String result = Arrays.stream(str).reduce("",(S,S2)-> S + S2 );
		System.out.println("R = "+result);

	}

}
