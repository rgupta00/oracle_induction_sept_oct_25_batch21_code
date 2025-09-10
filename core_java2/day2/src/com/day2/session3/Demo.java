package com.day2.session3;

public class Demo {

	public static void main(String[] args) {
		//String vs StringBuffer vs StringBuilder (Builder dp)
		// imm		---------mutable-----------------
				// slow	(syn)	   fast
		
		String info="india";
		String infoRev=new StringBuilder()
				.append(info).reverse().toString();
		
		
		
//		
//		String data=getData();
//		
//		String s1=data+"b"+"c"+"d";
//		System.out.println(s1);
	}

	private static String getData() {
		return "raj";
	}
}
