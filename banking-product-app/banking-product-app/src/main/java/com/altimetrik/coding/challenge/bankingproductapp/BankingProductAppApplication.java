package com.altimetrik.coding.challenge.bankingproductapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankingProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingProductAppApplication.class, args);
	}

}
