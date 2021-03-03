package com.solution.allmethods.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.solution"})
public class RestapiServiceProblemStatementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiServiceProblemStatementApplication.class, args);
	}

}
