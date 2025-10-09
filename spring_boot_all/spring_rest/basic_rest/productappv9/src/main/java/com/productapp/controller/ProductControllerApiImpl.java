package com.productapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.productapp.api.ProductControllerApi;
import com.productapp.model.ProductDto;

import jakarta.validation.Valid;
@RestController
public class ProductControllerApiImpl implements ProductControllerApi{

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return ProductControllerApi.super.getRequest();
	}

	@Override
	public ResponseEntity<ProductDto> addProduct(@Valid ProductDto productDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(new ProductDto());
	}

	@Override
	public ResponseEntity<String> deleteById(Integer id) {
		// TODO Auto-generated method stub
		return ProductControllerApi.super.deleteById(id);
	}

	@Override
	public ResponseEntity<List<ProductDto>> getAll() {
		// TODO Auto-generated method stub
		return ProductControllerApi.super.getAll();
	}

	@Override
	public ResponseEntity<ProductDto> getById(Integer id) {
		// TODO Auto-generated method stub
		return ProductControllerApi.super.getById(id);
	}

	@Override
	public ResponseEntity<ProductDto> updateProduct(Integer id, @Valid ProductDto productDto) {
		// TODO Auto-generated method stub
		return ProductControllerApi.super.updateProduct(id, productDto);
	}

}
