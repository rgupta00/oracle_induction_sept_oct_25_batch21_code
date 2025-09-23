package com.productapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import jakarta.persistence.EntityManager;

@SpringBootApplication
public class Productappv5Application implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(Productappv5Application.class, args);
	}

	//quick and dirty way to check whether our config is working or not 
	@Override
	public void run(String... args) throws Exception {
		if(jdbcTemplate!=null) {
			System.out.println("------------jdbcTemplate is created---------------");
		}
		if(em!=null) {
			System.out.println("------------em is created---------------");
		}
		
		if(dataSource!=null) {
			System.out.println("------------ds is created---------------");
		}
	}

}
