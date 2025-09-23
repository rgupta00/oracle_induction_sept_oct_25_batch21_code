//package com.productapp.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//import com.productapp.repo.ProductRepo;
//import com.productapp.repo.ProductRepoJdbcImpl;
//import com.productapp.service.ProductService;
//import com.productapp.service.ProductServiceImpl;
//
//@Configuration
//@ComponentScan(basePackages = "com.productapp")
//final public class AppConfig {
////
////	@Bean
////	@Scope("singleton")
////	 ProductRepo productRepo() {
////		return new ProductRepoJdbcImpl();
////	}
////	
////	@Bean(name = "productSer")
////	@Scope("singleton")
////	ProductService productService(ProductRepo productRepo) {
////		return new ProductServiceImpl(productRepo);
////	}
//}
