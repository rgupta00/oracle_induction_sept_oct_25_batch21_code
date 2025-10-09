package com.productapp.clientcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.dto.ProductDto;
import com.productapp.service.ProductServiceProxy;

@RestController
@RequestMapping(path = "api/client")
public class ProductClientController {

	private ProductServiceProxy productServiceProxy;
	
	@Autowired
	public ProductClientController(ProductServiceProxy productServiceProxy) {
		this.productServiceProxy = productServiceProxy;
	}


	@GetMapping(path = "products/{id}")
	public ResponseEntity<ProductDto> getOne(@PathVariable int id) {
		return productServiceProxy.getById(id);
	}
	
	@GetMapping(path = "products")
	public ResponseEntity<List<ProductDto>> getAll() {
		return productServiceProxy.getAll();
	}
	
	
}
