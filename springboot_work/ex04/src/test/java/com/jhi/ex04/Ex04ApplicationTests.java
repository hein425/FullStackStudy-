package com.jhi.ex04;

import com.jhi.ex04.Obj.AA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex04ApplicationTests {

	@Autowired
	public AA aa;

	@Test
	void contextLoads() {
		aa.doA();
	}

}
