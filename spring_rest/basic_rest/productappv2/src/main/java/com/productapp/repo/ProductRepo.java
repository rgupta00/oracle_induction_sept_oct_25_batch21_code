package com.productapp.repo;

import java.util.List;

public interface ProductRepo {
	public List<Product> getAll();
	public Product getById(int id);
}
