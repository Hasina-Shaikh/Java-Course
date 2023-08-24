package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.examle")
@ComponentScan("com.org.cornerstone.")
public class SqlLombok1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqlLombok1Application.class, args);
	}

}
