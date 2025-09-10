package com.day2.session3;
//interface abs class, final kb (const) of c++
//final : class, data, method , final method arg

class MyVeryImpLogic{
	 
	final void f1() {
		System.out.println("f1 mehtod ");
	}
	void f2() {
		System.out.println("f2 mehtod ");
	}
}
class ABC extends MyVeryImpLogic{
//	void f1() {
//		System.out.println("f1 mehtod can not override it");
//	}
	
	void f2() {
		System.out.println("f2 mehtod override");
	}
}

class Emp{
	private int id;
	private String name;
	private double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("id : "+ id +" name: "+ name +"salary: "+salary);
	}
}
public class C_FinalKeyword {

	public static void main(String[] args) {
//		final int i=9;
//		i=99;
		final Emp e1=new Emp(1, "raj", 10000);
		final Emp e2=new Emp(12, "ekta", 11000);
		
		e1.setSalary(e1.getSalary()*1.1);
		
		boolean result= higherSalary(e1, e2);
	}

	private static boolean higherSalary(final Emp e1,final Emp e2) {
		return Double.compare(e1.getSalary(), e2.getSalary())>0;
	}
}











