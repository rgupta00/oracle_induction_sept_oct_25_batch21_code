package com.productmgtapp.dao;

import java.sql.SQLException;

import com.productmgtapp.exceptions.DataAccessException;
import com.productmgtapp.exceptions.HibernateException;

public interface ProductDao {
	public void saveProduct(Product product)throws DataAccessException;
}
