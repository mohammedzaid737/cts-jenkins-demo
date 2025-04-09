package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CtsJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(CtsJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case started executing...");
		assertEquals(false, true);
	}

}
