package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProtectoraAnimalesWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtectoraAnimalesWebApplication.class, args);
		/**
		 * SET @@global.time_zone = ‘+00:00’;
		 * SET @@session.time_zone = ‘+00:00’;
		 */
	}

}
