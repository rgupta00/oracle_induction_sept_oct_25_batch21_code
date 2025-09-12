package com.java8.session1.ex1.functional_interface;

import java.util.Comparator;

//funcation interface SAM
@FunctionalInterface
interface Foo{
	 void foof();
}
interface Cal{
	int add(int a, int b);
}
public class DemoFunctionalInteraface {

	public static void main(String[] args) {
		
		Comparator<Employee> comparator=
				( o1,  o2)-> Double.compare(o1.getSalary(), o2.getSalary());
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Cal cal=(a, b)-> a+b;
//		System.out.println(cal.add(2, 1));
		
		
		
		//java7--> java8
		
		//Foo f=()-> System.out.println("foof impl");
			

	}
}
