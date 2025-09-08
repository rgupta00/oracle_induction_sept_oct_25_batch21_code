package com.day1.session1improvedcode;

import java.util.Arrays;

public class ArrayCopyMethod {

	public static void main(String[] args) {
		int arr[]= {4,6,8};
		int cpArr[]=copyArray(arr);
		System.out.println("print original arr");
//		for(int temp: arr) {
//			System.out.print(temp+ " ");
//		}
		cpArr[0]=9999;
		
		for(int temp: arr) {
			System.out.print(temp+ " ");
		}
	}

	private static int[] copyArray(int[] arr) {
		return Arrays.copyOf(arr, arr.length);
	}
}
