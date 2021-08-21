package com.everis.logicserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LogicServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogicServerApplication.class, args);

		int x = 1;
		if ((x % 2) == 0) {
			System.out.println("Es par.");
		} else {
			System.out.println("No es par.");
		}
	}
}
