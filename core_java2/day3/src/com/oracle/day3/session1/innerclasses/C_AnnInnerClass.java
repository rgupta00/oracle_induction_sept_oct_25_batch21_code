package com.oracle.day3.session1.innerclasses;
//java 8 stream processing lambda -> ann innner class
interface Cookable{
	void cook();
}
public class C_AnnInnerClass {
	public static void main(String[] args) {
//		
//		Cookable c1=new Cookable() {	
//			@Override
//			public void cook() {
//				System.out.println("street food");
//			}
//		};
		
		
		Cookable c1=()-> System.out.println("street food");
		Cookable c2=()-> System.out.println("home food");
		Cookable c3=()-> System.out.println("hotel food");
		
		c1.cook();
		c2.cook();
		c3.cook();
		
		
		
		
		
		
		
//		Cookable c2=new Cookable() {	
//			@Override
//			public void cook() {
//				System.out.println("home food");
//			}
//		};
//		c1.cook();
//		c2.cook();
//		
//		Cookable c3=new Cookable() {	
//			@Override
//			public void cook() {
//				System.out.println("hotel food");
//			}
//		};
//		
//		c3.cook();
	}

}
