package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;

import jakarta.validation.Valid;

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
	public ResponseEntity<List<Product>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(productService.getAll());
	}
	//get a product by id
	@GetMapping(path = "products/{id}")
	public ResponseEntity<Product> getById(@PathVariable("id") int id) {
		return ResponseEntity.ok(productService.getById(id));
	}
	//add: parser jakson : @RequestBody it tigger the parser to convert json --> java 
	@PostMapping(path = "products")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody  Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
	}
	
	//update
	@PutMapping(path = "products/{id}")
	public ResponseEntity<Product> updateProduct( @PathVariable("id") int id, 
			@Valid @RequestBody  Product product) {
		return ResponseEntity.ok(productService.updateProduct(id, product));
	}
	
	//delete
	@DeleteMapping(path = "products/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") int id) {
		 productService.deleteProduct(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}






