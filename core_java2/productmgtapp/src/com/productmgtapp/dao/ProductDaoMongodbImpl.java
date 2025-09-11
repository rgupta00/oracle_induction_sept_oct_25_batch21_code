package com.productmgtapp.dao;

import com.productmgtapp.exceptions.DataAccessException;
import com.productmgtapp.exceptions.MongodbException;

public class ProductDaoMongodbImpl implements ProductDao{

	@Override
	public void saveProduct(Product product) throws DataAccessException {
		try {
			if(1==1)
				throw new MongodbException("some mongo conn fail");
		}catch(MongodbException e) {
			throw new DataAccessException("some mongodb hell", e);
		}
		System.out.println("code to add product to mongod db databse");
	}

}
