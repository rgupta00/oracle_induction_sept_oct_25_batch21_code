package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	//get all the products
	@GetMapping(path = "products")
	public List<Product> getAll(){
		return productService.getAll();
	}
	//get a product by id
	@GetMapping(path = "products/{id}")
	public Product getById(@PathVariable("id") int id) {
		return productService.getById(id);
	}
	//add
	
	//update
	
	//delete
	
}
