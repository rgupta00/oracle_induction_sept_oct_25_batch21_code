package com.demo;
import java.util.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class WhatIfFirstLevelCache{
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence
				.createEntityManagerFactory("demo_pu");
		
		EntityManager em=emf.createEntityManager();
		
		Product product=em.find(Product.class, 8);
		System.out.println(product);
		
		System.out.println("---------------------------------------------");
		em.clear();
		Product product2=em.find(Product.class, 8);
		System.out.println(product2);
		
		em.close();
		emf.close();
	}
	
}
