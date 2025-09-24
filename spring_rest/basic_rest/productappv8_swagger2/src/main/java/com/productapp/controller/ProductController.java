package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.api.ProductControllerApi;
import com.productapp.model.Product;
import com.productapp.service.ProductService;


@RestController
public class ProductController implements ProductControllerApi {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<Product> addProduct(Product product) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Product>> getAll() {
       return null;
    }

    @Override
    public ResponseEntity<Product> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Product> updateProduct(Integer id, Product product) {
       return null;
    }
}




