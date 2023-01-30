package com.mgsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProyectMicroServicesRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectMicroServicesRegistryServiceApplication.class, args);
	}

}
