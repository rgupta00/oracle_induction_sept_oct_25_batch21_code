package com.productapp.repo;
import java.sql.*;
import java.util.*;
import java.math.BigDecimal;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository("productRepoJdbc")
public class ProductRepoJdbcImpl implements ProductRepo {

	private DataSource dataSource;
	
	@Autowired
	public ProductRepoJdbcImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Product> getAll() {
		List<Product> list=new ArrayList<>();
		try{
			Connection connection=dataSource.getConnection();
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			while(rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public void addProduct(Product product) {
		
	}

}
