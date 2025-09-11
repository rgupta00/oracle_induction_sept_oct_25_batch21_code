package com.productmgtapp.dao;

import java.sql.SQLException;

import com.productmgtapp.exceptions.DataAccessException;

public class ProductDaoJdbcImpl implements ProductDao {

	@Override
	public void saveProduct(Product product)  {
		//let assume there is code to add the product object to db
		try{
			if(1==1)
				throw new SQLException("jdbc conn failed");
			
			System.out.println("code to add the product object to db using jdbc");
		}catch(SQLException ex) {
			throw new DataAccessException("some jdbc hell", ex);
		}
		
	}

}
