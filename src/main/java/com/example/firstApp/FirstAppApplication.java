package com.example.firstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(FirstAppApplication.class, args);
		Developer dev=context.getBean(Developer.class);// this will only work if Developer is a Spring managed bean (class)
		dev.build();
	}

}
