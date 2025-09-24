package com.productapp.repo;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "product_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "product_name")
	@NotNull(message = "{product.name.absent}")
	private String name;
	
	@NotNull(message = "{product.price.absent}")
	@Range(min = 10, max = 1000000, message = "{product.price.invalid}")
	@Column(name = "product_price")
	private BigDecimal price;

	public Product( String name,BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}
	

	
}
