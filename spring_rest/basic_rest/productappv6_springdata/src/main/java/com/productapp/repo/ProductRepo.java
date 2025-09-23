package com.productapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.http.converter.json.ProblemDetailJacksonXmlMixin;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	public List<Product>findByName(String name);
}
