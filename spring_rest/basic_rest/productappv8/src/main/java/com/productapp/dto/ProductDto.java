package com.productapp.dto;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Range;

import com.productapp.repo.Product;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
	private int id;

	@Column(name = "product_name")
	@NotNull(message = "{product.name.absent}")
	private String name;

	@NotNull(message = "{product.price.absent}")
	@Range(min = 10, max = 1000000, message = "{product.price.invalid}")
	@Column(name = "product_price")
	private BigDecimal price;
}
