package com.productmgtapp.dao;

import java.sql.SQLException;

import com.productmgtapp.exceptions.DataAccessException;
import com.productmgtapp.exceptions.HibernateException;

public class ProductDaoHibernateImpl implements ProductDao {

	@Override
	public void saveProduct(Product product) {
		try{//let assume there is code to add the product object to db
			if(1==1)
				throw new HibernateException("some hib factory failed");
		System.out.println("code to add the product object to db using hibernate");
		}catch(HibernateException e) {
			throw new DataAccessException("some hib hell", e);
		}
	}

}
