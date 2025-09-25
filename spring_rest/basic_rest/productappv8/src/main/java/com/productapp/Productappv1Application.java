package com.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableAspectJAutoProxy
@SpringBootApplication
public class Productappv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}

}
