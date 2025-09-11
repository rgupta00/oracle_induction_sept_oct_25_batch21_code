package com.productmgtapp.service;

import java.sql.SQLException;

import com.productmgtapp.dao.Product;
import com.productmgtapp.dao.ProductDao;
import com.productmgtapp.dao.ProductDaoHibernateImpl;
import com.productmgtapp.dao.ProductDaoJdbcImpl;
import com.productmgtapp.dao.ProductDaoMongodbImpl;
import com.productmgtapp.exceptions.HibernateException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao=new ProductDaoMongodbImpl();
	
	@Override
	public void saveProduct(Product product)  {
		
		productDao.saveProduct(product);
	}

}
