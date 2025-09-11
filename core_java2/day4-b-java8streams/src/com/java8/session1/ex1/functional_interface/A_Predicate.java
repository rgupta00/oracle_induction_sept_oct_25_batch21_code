package com.java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
//Predicate: Data -> true/false
public class A_Predicate {
    public static void main(String[] args) {

       //What is predicate? data -> true/false
    	
    	String nameData="rajeev";
    	
    	Predicate<String> myPredicate= t->  t.contains("raj");
		System.out.println(myPredicate.test(nameData));	
		
    	//predicate to check if no is even
		Predicate<Integer> predicateOdd=no-> no%2!=0;
		System.out.println(predicateOdd.test(33));
		
		//rich employee: 5L
		Predicate<Employee> richEmpPredicate= e->  e.getSalary()>=5_00_000;
		
		Employee e1=new Employee(121, "anil", 1_00_00);
		
		System.out.println(richEmpPredicate.test(e1));
		
		//x> y : t : false
		BiPredicate<Integer, Integer> biPredicate=( a,  b)-> a>=b;
		
	
		
		
		
		
		
		
		
		
		
    	
    	
//    	Predicate<Integer>predicateEven= x -> x%2==0;
//        System.out.println(predicateEven.test(7));

//    Predicate<String> nameContainRaj= s-> s.contains("raj");
//        System.out.println(nameContainRaj.test("rajiv"));

    	//rich emp : 60LPA
//    	Predicate<Employee>richEmp= e-> e.getSalary()>=60_00_00_0;
//        System.out.println(richEmp.test(new Employee(1,"raj",90_00_00_0)));

		//BiPredicate
        BiPredicate<Integer,Integer> biPreidate=(a, b)-> a>=b;
		
		
    }
}
