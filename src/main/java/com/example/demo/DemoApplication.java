package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("This is to check another repo");
		System.out.println("Another change");
		System.out.println("Third commit message");
		SpringApplication.run(DemoApplication.class, args);
	}

}
