package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import com.productapp.service.aspect.MyLogging;
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
	public List<Product> getAll() {
		System.out.println("------------------service layer is called------getAll------");
		return  productRepo.findAll();	
	}
	
	@Cacheable(value="products", key = "#id")
	@MyLogging
	@Override
	public Product getById(int id) {
		return productRepo.findById(id)
				.orElseThrow(()->new ProductNotFoundException("product with id "+ id +" is not found"));
	}
	@CachePut(value="products", key="#result.id")
	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}
	@CachePut(value="products", key="#result.id")
	@Override
	public Product updateProduct(int id, Product product) {
		Product productToUpdate=getById(id);
		productToUpdate.setPrice(product.getPrice());
		productRepo.save(productToUpdate);
		return productToUpdate;
	}
	@CacheEvict(value="products", key="#id")
	@Override
	public Product deleteProduct(int id) {
		Product productToDelete=getById(id);
		
		productRepo.delete(productToDelete);
		
		return productToDelete;
	}

	@CacheEvict(value="products", allEntries=true)
	@Override
	public void invalidateCache() {}

}
