package com.oracle.day3.session1.ex_handling.mcq;

public class Mcq1 {
	public static void main(String[] args) {
		
			int value=callMe();
			System.out.println(value);
		
	}

	private static int callMe() {
		//GPP: never ever retrun a value from finally block
		try {
			if(1==1)
				return 1;
		}finally {
			return 0;
		}
	}
	
	
	
	
//	public static void main(String[] args) {
//		try{
//			callMe();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	private static void callMe() {
//		//GPP: never ever throw ex from finally block
//		try {
//			if(1==1)
//				throw new NullPointerException();
//		}finally {
//			throw new ArithmeticException();
//		}
//	}

}
