package com.productapp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.productapp.repo.Product;

public interface ProductService {
	public List<Product> getAllProductSorted(String field);
	public Page<Product> getAllProductPage(int offset, int pageSize);
	public Page<Product> getAllProductPageSorted(String field,int offset, int pageSize);
	
	public List<Product> getAll();
	public Product addProduct(Product product);
	public Product getById(int id);
	public List<Product> getByName(String name);
	public Product updateProduct(int id,Product product);
	public Product deleteProduct(int id);
}
