package com.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.dto.ProductDto;
import com.orderservice.service.ProductService;

@RestController
@RequestMapping(path = "api")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping(path = "producer")
	public String callProducer(@RequestBody  ProductDto productDto) {
		productService.produce(productDto);
		return "ok";
	}

}
