package com.day5.session3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// extends : upper bound
// super : lower bound: super se upper
class Animal{}
class Cat extends Animal{}
class CostlyCat extends Cat{}
class Dog extends Animal {}
class CostlyDog extends  Dog{}

public class B_Extends_SuperEx2 {

	public static void main(String[] args) {
		//List<Dog> dogs = new ArrayList<Dog>();
		
	//	List<Dog> dogs=new LinkedList<>();
//		dogs.add(new Dog());
//		dogs.add(new CostlyDog());
//		foo(dogs);
		//super se upper
		//List<? super Dog> dogs=new LinkedList<CostlyDog>();
		
		//foo(dogs);
	}

	 static void foo(List<? super Dog> dogs) {
//		 for(Dog d: dogs) {
//			 System.out.println(d);
//		 }
		dogs.add(new CostlyDog());
	}
}
