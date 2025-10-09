package com.productapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Productappv1Application implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(dataSource!=null) {
			System.out.println("--------------ds is created------------");
		}
	}

}
