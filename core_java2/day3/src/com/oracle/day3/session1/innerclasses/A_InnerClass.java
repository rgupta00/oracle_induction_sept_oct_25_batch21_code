package com.oracle.day3.session1.innerclasses;

import com.oracle.day3.session1.innerclasses.Outer.Inner;

/*
 * compostion
 */
class Outer{
	private int i=999;
	class Inner{
		private int i=9999;
		public void fooInner() {
			System.out
			.println("foo inner method acessing "
					+ "private data of outer class: "+ Outer.this.i);
		}
	}
	//the object of inner class can
	//not exist without object of outer class
	public  void fooOuter() {
		Inner inner=new Inner();
		inner.fooInner();	
	}
}
public class A_InnerClass {

	public static void main(String[] args) {
		Inner inner=new Outer().new Inner();
		inner.fooInner();
		
//		Outer outer=new Outer();
//		outer.fooOuter();
	}
}
