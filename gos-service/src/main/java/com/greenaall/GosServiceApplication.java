package com.greenaall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={
		"es.gob.aapp.*", "com.greenaall.*"})
@EnableDiscoveryClient
@EnableScheduling
public class GosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GosServiceApplication.class, args);
	}

	
}
