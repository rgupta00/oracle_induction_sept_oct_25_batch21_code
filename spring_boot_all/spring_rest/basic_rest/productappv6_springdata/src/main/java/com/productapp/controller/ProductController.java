package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;

@RestController
@RequestMapping(path="api")
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping(path = "productsorted")
	public List<Product> getAllProductSorted(@RequestParam(name="field")  String field) {
		return productService.getAllProductSorted(field);
	}

	//productpage?offset=4&pageSize=20
	@GetMapping(path = "productpage")
	public Page<Product> getAllProductPage(@RequestParam(name="offset") int offset,
			@RequestParam(name="pageSize") int pageSize) {
		return productService.getAllProductPage(offset, pageSize);
	}

	//productpagesorted?offset=4&pageSize=20&field=id
	@GetMapping(path = "productpagesorted")
	public Page<Product> getAllProductPageSorted(int offset, int pageSize,String field) {
		return productService.getAllProductPageSorted(field, offset, pageSize);
	}
		
	
	
	//get all product
	@GetMapping(path = "products")
	//@RequestMapping(path="products", method = RequestMethod.GET)
	public List<Product> getAll(){
		return productService.getAll();
	}

}
