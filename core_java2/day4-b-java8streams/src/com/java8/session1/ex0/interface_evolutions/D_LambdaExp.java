package com.java8.session1.ex0.interface_evolutions;

@FunctionalInterface
interface Food{
	public void cook();
	
	public default  void fooDefault() {
		System.out.println("foo default method");
	}
	
	public static  void fooStatic() {
		System.out.println("foo stataic method");
	}
}

public class D_LambdaExp {
	public static void main(String[] args) {
		
	
	}
}


