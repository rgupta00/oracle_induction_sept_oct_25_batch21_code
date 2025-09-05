package com.demo;

public class A_DemoArray {
	public static void main(String[] args) {
//		int a[]=new int[5];
//		int a[]= {5,7,8,90};
//		for(int temp:a) {
//			System.out.println(temp);
//		}
//		for(int i=0;i<a.length; i++) {
//			System.out.println(a[i+1]);
//		}
		
		int a[][]= new int[3][3];
		for(int temp[]:a) {
			for(int temp2: temp) {
				System.out.print(temp2+" ");
			}
			System.out.println();
		}
		
	}
}


















