package com.productapp.service;

import java.util.List;

import com.productapp.dto.ProductDto;
//SL=BL + CCC(cross cutting concern*)
public interface ProductService {
	
	public List<ProductDto> getAll();
	public ProductDto getById(int id);
	
	public ProductDto addProduct(ProductDto productDto);
	public ProductDto updateProduct(int id , ProductDto productDto);
	public ProductDto deleteProduct(int id);
	
	public void invalidateCache();
}
