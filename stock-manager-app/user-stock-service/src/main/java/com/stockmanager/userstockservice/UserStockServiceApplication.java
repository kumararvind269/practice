package com.stockmanager.userstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@SpringBootApplication
public class UserStockServiceApplication { 

	public static void main(String[] args) {
		SpringApplication.run(UserStockServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
