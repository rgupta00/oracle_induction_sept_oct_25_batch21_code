package com.productapp.repo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("productRepoJdbc")
public class ProductRepoJdbcTemplateImpl implements ProductRepo {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductRepoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Product> getAll() {
		return jdbcTemplate.query("select * from product",
				new BeanPropertyRowMapper<>(Product.class));
		
	}

	@Override
	public void addProduct(Product product) {
		
	}

}
