package com.productmgtapp.service;

import java.sql.SQLException;

import com.productmgtapp.dao.Product;
import com.productmgtapp.exceptions.HibernateException;
//BL*
public interface ProductService {
	public void saveProduct(Product product);
}
