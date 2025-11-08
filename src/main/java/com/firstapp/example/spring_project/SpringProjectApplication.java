package com.firstapp.example.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringProjectApplication.class, args);

		System.out.println("Hello!  This is my first spring app");
	}



}
