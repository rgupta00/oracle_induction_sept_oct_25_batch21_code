package com.productmgtapp.controller;

import java.sql.SQLException;

import com.productmgtapp.dao.Product;
import com.productmgtapp.exceptions.DataAccessException;
import com.productmgtapp.exceptions.HibernateException;
import com.productmgtapp.service.ProductService;
import com.productmgtapp.service.ProductServiceImpl;

public class Controlller {
	public static void main(String[] args) {
		try {
			ProductService productService=new ProductServiceImpl();
			productService.saveProduct(new Product(1, "laptop", 567000));
		} catch (DataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
