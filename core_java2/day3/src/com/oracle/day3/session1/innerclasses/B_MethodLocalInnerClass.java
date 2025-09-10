package com.oracle.day3.session1.innerclasses;
class M{
	public void foo() {
		class N{
			public void fooN() {
				System.out.println("fooN method ");
			}
		}
		
		N n=new N();
		n.fooN();
	}
}
public class B_MethodLocalInnerClass {
	public static void main(String[] args) {
		
	}
}
