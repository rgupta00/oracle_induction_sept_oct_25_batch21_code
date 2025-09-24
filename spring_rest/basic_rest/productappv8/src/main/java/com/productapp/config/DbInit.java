package com.productapp.config;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;

@Configuration
public class DbInit implements CommandLineRunner{
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public void run(String... args) throws Exception {
//		productRepo.save(new Product("laptop", BigDecimal.valueOf(120000)));
//		productRepo.save(new Product("laptop", BigDecimal.valueOf(1200)));
	}
}
