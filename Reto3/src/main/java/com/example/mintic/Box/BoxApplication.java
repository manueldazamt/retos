package com.example.mintic.Box;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.example.mintic.Box.model"})
@SpringBootApplication
public class BoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoxApplication.class, args);
	}

}
