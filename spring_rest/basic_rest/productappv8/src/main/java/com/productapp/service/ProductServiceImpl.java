package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import com.productapp.service.aspect.MyLogging;
import com.productapp.util.UtilConvertor;
//BL+ CCC
@Service
@Transactional(isolation = Isolation.SERIALIZABLE)
public class ProductServiceImpl implements ProductService{

	private ProductRepo productRepo;
	
	
	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	@MyLogging
	@Cacheable(value="products")
	@Override
	public List<ProductDto> getAll() {
		System.out.println("------------------service layer is called------getAll------");
		return  productRepo.findAll().stream()
				.map(UtilConvertor::productToProductDto).toList();	
	}
	
	@Cacheable(value="products", key = "#id")
	@MyLogging
	@Override
	public ProductDto getById(int id) {
		Product product= productRepo.findById(id)
				.orElseThrow(()->new ProductNotFoundException("product with id "+ id +" is not found"));
		return UtilConvertor.productToProductDto(product);
	}
	@CachePut(value="products", key="#result.id")
	@Override
	public ProductDto addProduct(ProductDto productDto) {
		Product productToSave=UtilConvertor.productDtoToProduct(productDto);
		
		productRepo.save(productToSave);
		
		return UtilConvertor.productToProductDto(productToSave);
		
	}
	@CachePut(value="products", key="#result.id")
	@Override
	public ProductDto updateProduct(int id, ProductDto productDto) {
		ProductDto productDtoToUpdate=getById(id);
		productDtoToUpdate.setPrice(productDto.getPrice());
		productRepo.save(UtilConvertor.productDtoToProduct(productDtoToUpdate));
		return productDtoToUpdate;
	}
	@CacheEvict(value="products", key="#id")
	@Override
	public ProductDto deleteProduct(int id) {
		ProductDto productToDelete=getById(id);
		
		productRepo.delete(UtilConvertor.productDtoToProduct(productToDelete));
		
		return productToDelete;
	}

	@CacheEvict(value="products", allEntries=true)
	@Override
	public void invalidateCache() {}

}
