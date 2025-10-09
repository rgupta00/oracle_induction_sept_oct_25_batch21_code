package com.productapp.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository("productRepoMap")
public class ProductRepoMapImpl implements ProductRepo {

	@Override
	public List<Product> getAll() {
		System.out.println("product repo impl using collection/ map");
		return List.of(new Product(1,"laptop",BigDecimal.valueOf(120000)),
				new Product(1,"laptop stand",BigDecimal.valueOf(1200)));
	}


	@Override
	public void addProduct(Product product) {
		System.out.println("add product method is called for map impl");
	}
}
