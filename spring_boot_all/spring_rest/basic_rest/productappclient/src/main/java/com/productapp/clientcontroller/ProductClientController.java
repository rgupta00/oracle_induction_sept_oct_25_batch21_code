package com.productapp.clientcontroller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.productapp.dto.ProductDto;

@RestController
@RequestMapping(path = "api/client")
public class ProductClientController {

	private RestTemplate restTemplate;

	public ProductClientController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping(path = "products/{id}")
	public ProductDto getOne(@PathVariable int id) {
		ResponseEntity<ProductDto> productDtoResponesEntity = restTemplate
				.getForEntity("http://localhost:9080/api/products/" + id, ProductDto.class);
		System.out.println(productDtoResponesEntity.getStatusCode());
		System.out.println(productDtoResponesEntity.getHeaders());
		return productDtoResponesEntity.getBody();

	}
}
