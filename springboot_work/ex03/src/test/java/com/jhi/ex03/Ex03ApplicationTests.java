package com.jhi.ex03;

import com.jhi.ex03.user.User;
import com.jhi.ex03.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class Ex03ApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
		System.out.println("실행");

		User user = User.builder()
				.name("홍길동")
				.age(20)
				.email("aaa@naver.com")
				.password("password")
				.wdate(LocalDateTime.now())
				.build();

		userRepository.save(user);
	}

	@Test
	void selectTest(){
		userRepository.findAll()
				.stream()
				.forEach(System.out::println);

	}

}
