package com.day1.session1improvedcode;

public class Two2MatixTester {

	public static void main(String[] args) {
		int data[][] = { { 1, 0, 0 }, { 0, 1, 0}, { 0, 0, 1 } };
		Two2Matix matix=new Two2Matix(data);
		
		matix.print2DMatrix();
		System.out.println(matix.checkIsIdentiyMatrix());
		
		data[1][1]=0;
		
		matix.print2DMatrix();
		System.out.println(matix.checkIsIdentiyMatrix());
	
		
	}
}
