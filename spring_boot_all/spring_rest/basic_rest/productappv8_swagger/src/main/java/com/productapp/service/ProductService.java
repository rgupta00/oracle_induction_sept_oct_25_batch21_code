package com.productapp.service;

import java.util.List;

import com.productapp.repo.Product;
//SL=BL + CCC(cross cutting concern*)
public interface ProductService {
	public List<Product> getAll();
	public Product getById(int id);
	
	public Product addProduct(Product product);
	public Product updateProduct(int id , Product product);
	public Product deleteProduct(int id);
}
