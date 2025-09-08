package com.day1.session2.oo_relationship;

class Cal{
	double add(int a,double b) {
		System.out.println("double add(int a,double b) ");
		return a+b;
	}
	double add(double a, int b) {
		System.out.println("double add(double a, int b) ");
		return a+b;
	}
}

class Foo{
	public void print(String a) {
		System.out.println("1");
	}
	
	public void print(Object a) {
		System.out.println("3");
	}
}
public class DemoFunctionOverloading {

	public static void main(String[] args) {
		Foo f=new Foo();
		f.print(null);
		
		
		Cal cal=new Cal();
		System.out.println(cal.add(9,(double)8));
	}
}




//int add(int a, int b, int c) {
//System.out.println("int add(int a, int b, int c)");
//return a+b+c;
//}
//int add(int ...a) {
//System.out.println("int add(int ...a)");
//int temp=0;
//for(int i: a) {
//	temp+=i;
//}
//return temp;
//}








