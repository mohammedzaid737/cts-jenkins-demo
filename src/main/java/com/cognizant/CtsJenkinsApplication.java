package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class CtsJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(CtsJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(CtsJenkinsApplication.class, args);
	}

}
