package com.wozu.api2;

import com.wozu.api2.Controllers.DogController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Api2ApplicationTests {

	@Autowired
	DogController dogController;

	@Test
	void contextLoads() {
	}

}
