package com.tech.cholla.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DataServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(DataServiceApp.class, args);
	}
}
