package com.productapp.repo;
import java.sql.*;
import java.util.*;
import java.math.BigDecimal;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
@Repository("productRepoJpa")
@Primary
public class ProductRepoJpaImpl implements ProductRepo {

	private EntityManager em;
	
	@Autowired
	public ProductRepoJpaImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Product> getAll() {
		return em.createQuery("select p from Product p", Product.class).getResultList();
	}

	@Override
	public void addProduct(Product product) {
		
	}

}
