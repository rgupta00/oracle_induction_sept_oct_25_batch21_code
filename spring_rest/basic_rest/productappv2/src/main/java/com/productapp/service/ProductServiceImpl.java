package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepo productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	@Override
	public List<Product> getAll() {
		return productRepo.getAll();
	}
	@Override
	public Product getById(int id) {
		Product product=productRepo.getById(id);
		if(product==null) {
			throw new ProductNotFoundException("product with id "+ id +" is not found");
		}
		return product;
	}

}
