package com.productapp.repo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepoMapImpl implements ProductRepo{

	private static Map<Integer, Product> map;
	static {
		map=new HashMap<>();
		map.put(1, new Product(1, "laptop", BigDecimal.valueOf(120000.00)));
		map.put(2, new Product(1, "laptop stand", BigDecimal.valueOf(900.00)));
		
	}
	
	@Override
	public List<Product> getAll() {
		return new LinkedList<>(map.values());
	}

	@Override
	public Product getById(int id) {
		return map.get(id);
	}

}
