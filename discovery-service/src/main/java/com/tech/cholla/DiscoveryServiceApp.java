/**
 * 
 */
package com.tech.cholla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Suresh
 *
 */
@EnableEurekaServer
@SpringBootApplication

public class DiscoveryServiceApp {
	public static void main(String[] args) {
		//System.setProperty("spring.config.name", "application");
		SpringApplication.run(DiscoveryServiceApp.class, args);

	}

}
