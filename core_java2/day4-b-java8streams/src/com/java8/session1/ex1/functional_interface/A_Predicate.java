package com.java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
//Predicate: Data -> true/false

public class A_Predicate {
    public static void main(String[] args) {

    	//write a predicate to find rich emp >10L
    	Predicate<Employee> p3=e-> e.getSalary()>=10_00000;
    	BiPredicate<Employee, Employee> p4=(e1, e2)->e1.getSalary()> e2.getSalary();
    	
    	
    	
       //What is predicate? data -> true/false
    	//if the name of person contain raj --> true/false
    	Predicate<String> p1= name-> name.contains("raj");
		Predicate<Integer> p2=no-> no%2==0;
		
		//BiPredicate<Integer, Integer> p3=(x, y)-> x>y;
		
		//System.out.println(p2.test(666));
    	
    	//System.out.println(p1.test("ekta"));
	
    
		
		
		
		
		
		
    	
    	
//    	Predicate<Integer>predicateEven= x -> x%2==0;
//        System.out.println(predicateEven.test(7));

//    Predicate<String> nameContainRaj= s-> s.contains("raj");
//        System.out.println(nameContainRaj.test("rajiv"));

    	//rich emp : 60LPA
//    	Predicate<Employee>richEmp= e-> e.getSalary()>=60_00_00_0;
//        System.out.println(richEmp.test(new Employee(1,"raj",90_00_00_0)));

		//BiPredicate
     //   BiPredicate<Integer,Integer> biPreidate=(a, b)-> a>=b;
		
		
    }
}
