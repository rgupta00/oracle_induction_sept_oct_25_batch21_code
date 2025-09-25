package com.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableAspectJAutoProxy
//@EnableCaching
//@EnableScheduling
@SpringBootApplication
public class Productappv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}

}
