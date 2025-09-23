package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
@Service(value = "productSer")
public class ProductServiceImpl implements ProductService{

	//@Autowired
	//@Qualifier(value = "productRepoJdbc")
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
	public void addProduct(Product product) {
		productRepo.addProduct(product);
	}

}
