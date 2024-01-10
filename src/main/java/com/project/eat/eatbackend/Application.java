package com.project.eat.eatbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
@EntityScan(basePackages = "com.project.eat.eatbackend") 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
