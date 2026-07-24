package es.greenaall.gos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GosWsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GosWsServiceApplication.class, args);
	}

}
