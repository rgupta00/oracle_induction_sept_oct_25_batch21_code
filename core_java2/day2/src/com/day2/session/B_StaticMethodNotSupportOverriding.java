package com.day2.session;
class X{
	public static void foo() {
		System.out.println("I");
	}
}
class Y extends X{
	public static void foo() {
		System.out.println("II");
	}
}
public class B_StaticMethodNotSupportOverriding {

	public static void main(String[] args) {
		Y x=new Y();
		x.foo();
	}
}
