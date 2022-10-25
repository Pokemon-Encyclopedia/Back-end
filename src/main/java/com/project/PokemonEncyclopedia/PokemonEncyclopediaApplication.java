package com.project.PokemonEncyclopedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PokemonEncyclopediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonEncyclopediaApplication.class, args);
	}

}
