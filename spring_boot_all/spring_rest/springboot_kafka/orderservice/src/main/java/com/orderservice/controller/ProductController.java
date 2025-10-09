package com.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.service.ProductService;

@RestController
@RequestMapping(path = "api")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping(path = "producer")
	public String callProducer(@RequestParam String message) {
		productService.produce(message);

		return "ok";
	}

}
