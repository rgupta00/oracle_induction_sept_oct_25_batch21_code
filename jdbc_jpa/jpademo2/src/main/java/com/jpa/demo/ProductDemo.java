package com.jpa.demo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("foo");
		EntityManager em=emf.createEntityManager();
		//print all the records
		List<Product>products=
		em.createQuery("select p from Product p", Product.class).getResultList();
		products.forEach(p-> System.out.println(p));
		em.close();
		emf.close();
		
	}
}
