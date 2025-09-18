package com.demo;
import java.util.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class DemoJpa{
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence
				.createEntityManagerFactory("demo_pu");
		
		EntityManager em=emf.createEntityManager();
		//hit the db and featch all the records
		//ORM
		List<Product> products=
				em.createQuery("select p from Product p", Product.class).getResultList();
		
		products.forEach(p-> System.out.println(p));
		
		em.close();
		emf.close();
	}
	
}
