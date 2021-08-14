package com.everis.logicserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableEurekaClient
@SpringBootApplication
public class LogicServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogicServerApplication.class, args);
	}

}
