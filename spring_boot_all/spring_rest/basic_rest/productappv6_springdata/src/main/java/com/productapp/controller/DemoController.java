//package com.productapp.controller;
//
//import java.util.List;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.productapp.repo.Product;
//import com.productapp.service.ProductService;
//
//public class DemoController {
//
//	public static void main(String[] args) {
////		ProductRepo productRepo=new ProductRepoMapImpl();
////		
////		ProductService productService=new ProductServiceImpl(productRepo);
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
//		ProductService productService=(ProductService) applicationContext.getBean("productSer");
//		List<Product> products=productService.getAll();
//		products.forEach(p-> System.out.println(p));
//		
//	}
//}
