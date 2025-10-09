package com.productapp;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class Productappv5Application implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Productappv5Application.class, args);
	}

	//quick and dirty way to check whether our config is working or not 
	@Override
	public void run(String... args) throws Exception {
		Random random = new Random();

        List<Product> products = IntStream.rangeClosed(1, 3000)
                .mapToObj(i -> new Product("product " + i, BigDecimal.valueOf(random.nextDouble() * 5000)))
                .toList();
		
		//productRepo.saveAll(products);
	}

}
