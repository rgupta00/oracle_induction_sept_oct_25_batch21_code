package com.productapp.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.productapp.dto.ProductDto;

@FeignClient(name="product-service", url="http://localhost:9080/api")  
public interface ProductServiceProxy {
	
	@GetMapping(path = "products", produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<ProductDto>> getAll();
	
	
	@GetMapping(path = "products/{id}")
	public ResponseEntity<ProductDto> getById(@PathVariable("id") int id) ;
	
	
	@PostMapping(path = "products")
	public ResponseEntity<ProductDto> addProduct(@RequestBody  ProductDto productDto) ;
	
	//update
	@PutMapping(path = "products/{id}")
	public ResponseEntity<ProductDto> updateProduct( @PathVariable("id") int id, 
			 @RequestBody  ProductDto productDto);
	//delete
	@DeleteMapping(path = "products/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") int id) ;
}
