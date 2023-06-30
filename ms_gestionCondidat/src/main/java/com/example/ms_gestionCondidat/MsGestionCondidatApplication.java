package com.example.ms_gestionCondidat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsGestionCondidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionCondidatApplication.class, args);
	}

}
