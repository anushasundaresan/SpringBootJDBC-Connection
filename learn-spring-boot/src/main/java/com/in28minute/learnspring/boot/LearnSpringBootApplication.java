package com.in28minute.learnspring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//(scanBasePackages = "com.baeldung.boot.jsp")

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan

public class LearnSpringBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
