package com.day2.session3;

public class A_StringClass {

	public static void main(String[] args) {
		
		String s2=new String("hi");
		String s1="hi";
		
		if(s1==s2) {
			System.out.println("both hv same address");
		}
		if(s1.equals(s2)) {
			System.out.println("both hv same content");
		}
		
	}
}
