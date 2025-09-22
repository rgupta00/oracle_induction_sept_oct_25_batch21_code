package com.productapp.repo;

import java.util.List;

public interface ProductRepo {
	public List<Product> getAll();
	public Product getById(int id);
	
	public Product addProduct(Product product);
	public Product updateProduct(int id , Product product);
	public Product deleteProduct(int id);
}
