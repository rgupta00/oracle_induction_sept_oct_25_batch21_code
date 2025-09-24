package com.productapp.repo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;

@Repository
public class ProductRepoMapImpl implements ProductRepo{

	private static Map<Integer, Product> map;
	private static int counter;
	static {
		map=new HashMap<>();
		map.put(1, new Product(1, "laptop", BigDecimal.valueOf(120000.00)));
		map.put(2, new Product(1, "laptop stand", BigDecimal.valueOf(900.00)));
		counter=2;
		
	}
	
	@Override
	public List<Product> getAll() {
		return new LinkedList<>(map.values());
	}

	@Override
	public Product getById(int id) {
		return map.get(id);
	}

	@Override
	public Product addProduct(Product product) {
		product.setId(++counter);
		map.put(counter, product);
		
		return product;
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product productToUpdate= getById(id);
		if(productToUpdate!=null) {
			productToUpdate.setPrice(product.getPrice());
			map.put(id, productToUpdate);
		}
		return productToUpdate;
	}

	@Override
	public Product deleteProduct(int id) {
		Product productToDelete= getById(id);
		if(productToDelete!=null) {
			map.remove(id);
		}
		return productToDelete;
	}

	
}
