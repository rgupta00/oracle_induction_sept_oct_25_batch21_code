package com.productapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductappLoggingApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(ProductappLoggingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductappLoggingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("hello logging");
	}

}
