package com.mgsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ProyectMicroServicesConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectMicroServicesConfigServiceApplication.class, args);
	}

}
