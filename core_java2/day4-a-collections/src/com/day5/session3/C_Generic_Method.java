package com.day5.session3;

public class C_Generic_Method {

	public static void main(String[] args) {
		
		Integer a=4;
		Integer b=6;
		Integer c=-1;
		Integer val=greater(a, b, c);
		
		
		System.out.println(val);
	
	}
	
	 static Integer greater(Integer a, Integer b, Integer c) {
		Integer max=a;
		//if boolean vs int
		if(b.compareTo(a)>0) {
		   max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		return max;
	}
}
