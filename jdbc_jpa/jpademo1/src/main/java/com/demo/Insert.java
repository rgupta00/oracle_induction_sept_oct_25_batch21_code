package com.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo_pu");
		EntityManager em=emf.createEntityManager();
		//insert : jdbc vs jpa
		em.getTransaction().begin();
		
		//transient
		Product product=new Product("coffee table", 620.00);
		//persited
		em.persist(product);
		product.setProductPrice(product.getProductPrice()*1.1);
		product.setProductPrice(product.getProductPrice()*1.1);
		product.setProductPrice(product.getProductPrice()*1.1);
		
		em.getTransaction().commit();
		em.close();
		
		emf.close();
	}
}
