package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestExampleApplication.class, args);
		System.out.println("Deployed thru Jenkins.........");
	}
}
