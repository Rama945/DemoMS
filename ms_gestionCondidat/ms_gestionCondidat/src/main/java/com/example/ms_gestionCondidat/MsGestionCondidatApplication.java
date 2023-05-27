package com.example.ms_gestionCondidat;

import com.example.ms_gestionCondidat.entities.Candidat;
import com.example.ms_gestionCondidat.repository.CandidatRepsitory;
import com.example.ms_gestionCondidat.service.ICandidatService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class MsGestionCondidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionCondidatApplication.class, args);
	}

	@Bean
	ApplicationRunner start(CandidatRepsitory repo) {
		return
				args -> {
					Stream.of(new Candidat("Manel", "Hamrouni", "manel.hamrouni@esprit.tn"),
									new Candidat("Ahmed", "Mrabet", "ahmed@gmail.com"))
							.forEach(
									candidat -> {
										repo.save(candidat);
									});
					repo.findAll().forEach(System.out::println);
				};
	}
}




