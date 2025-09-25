package com.productapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import com.productapp.service.aspect.MyLogging;
//BL+ CCC
@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepo productRepo;
	
	
	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	@MyLogging
	@Override
	public List<Product> getAll() {
		return  productRepo.findAll();	
	}
	
	@MyLogging
	@Override
	public Product getById(int id) {
		return productRepo.findById(id)
				.orElseThrow(()->new ProductNotFoundException("product with id "+ id +" is not found"));
		
		
	}
	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}
	@Override
	public Product updateProduct(int id, Product product) {
		Product productToUpdate=getById(id);
		productToUpdate.setPrice(product.getPrice());
		productRepo.save(productToUpdate);
		return productToUpdate;
	}
	@Override
	public Product deleteProduct(int id) {
		Product productToDelete=getById(id);
		
		productRepo.delete(productToDelete);
		
		return productToDelete;
	}

}
