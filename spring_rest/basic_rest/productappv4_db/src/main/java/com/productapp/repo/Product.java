package com.productapp.repo;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotNull;

public class Product {
	private int id;
	
	@NotNull(message = "name should not be null")
	private String name;
	
	@NotNull(message = "price should not be null")
	@Range(min = 10, max = 1000000, message = "price should be in range of 10 to 1000000")
	private BigDecimal price;
	

	
	public Product() {}

	public Product(int id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
}
