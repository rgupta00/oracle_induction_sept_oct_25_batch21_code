package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;

@RestController
@RequestMapping(path="api")
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//get all product
	@GetMapping(path = "products")
	//@RequestMapping(path="products", method = RequestMethod.GET)
	public List<Product> getAll(){
		return productService.getAll();
	}

}
