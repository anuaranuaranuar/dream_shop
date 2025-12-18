package com.parejo.dreamshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DreamShopApplication {
	public static void main(String[] args) {
		SpringApplication.run(DreamShopApplication.class, args);
	}

}
