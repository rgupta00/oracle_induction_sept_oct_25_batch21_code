package com.day5.session3;

public class C_Generic_Method {

	public static void main(String[] args) {
		
		Integer a=4;
		Integer b=6;
		Integer c=-1;
		Integer val=greater(a, b, c);
		
		Employee employee1=new Employee(188, "raj", 450.00);
		Employee employee2=new Employee(14345, "ekta", 1450.00);
		Employee employee3=new Employee(190, "keshav", 40.00);
		
		Employee gretestSalaryEmps=
				greater(employee1, employee2, employee3);
		
		
		System.out.println(val);
	
	}

	 static  <T extends Comparable<T>>  T greater(T a, T b, T c) {
		T max=a;
		if(b.compareTo(a)>0) {
		   max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		return max;
	}
}
