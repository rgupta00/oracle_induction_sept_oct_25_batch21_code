package com.productapp.util;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;

public class UtilConvertor {

	public static ProductDto productToProductDto(Product product) {
		return ProductDto.builder()
				.id(product.getId())
				.name(product.getName())
				.price(product.getPrice())
				.build();
	}
	public static Product productDtoToProduct(ProductDto productDto) {
		return Product.builder()
				.id(productDto.getId())
				.name(productDto.getName())
				.price(productDto.getPrice())
				.build();
		
	}
}
