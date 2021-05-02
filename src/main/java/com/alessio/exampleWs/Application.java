package com.alessio.exampleWs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// go to: http://localhost:8080/services/
		SpringApplication.run(Application.class, args);
	}
}
