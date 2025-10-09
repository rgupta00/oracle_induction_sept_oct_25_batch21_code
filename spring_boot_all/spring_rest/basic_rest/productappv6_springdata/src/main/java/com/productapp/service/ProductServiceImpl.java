package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
@Service(value = "productSer")
public class ProductServiceImpl implements ProductService{

	private ProductRepo productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Override
	public List<Product> getAll() {
		return productRepo.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}

	@Override
	public Product getById(int id) {
		return productRepo.findById(id)
				.orElseThrow(()->new ProductNotFoundException("product with id " + id +" is not found"));
	}

	@Override
	public List<Product> getByName(String name) {
		return productRepo.findByName(name);
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product productToUpdate=getById(id);
		productToUpdate.setPrice(product.getPrice());
		productRepo.save(productToUpdate);
		return productToUpdate;
	}

	@Override
	public Product deleteProduct(int id) {
		Product productToDelete=getById(id);
		productRepo.delete(productToDelete);
		
		return productToDelete;
	}

	@Override
	public List<Product> getAllProductSorted(String field) {
		return productRepo.findAll(Sort.by(Sort.Direction.DESC, field));
		
	}

	@Override
	public Page<Product> getAllProductPage(int offset, int pageSize) {
		return productRepo.findAll(PageRequest.of(offset, pageSize));
		
	}

	@Override
	public Page<Product> getAllProductPageSorted(String field, int offset, int pageSize) {
		return productRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
	}

	

}
