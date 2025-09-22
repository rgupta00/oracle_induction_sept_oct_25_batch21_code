package com.productapp.service;

import java.util.List;

import com.productapp.repo.Product;

public interface ProductService {
	public List<Product> getAll();
	public Product getById(int id);
}
