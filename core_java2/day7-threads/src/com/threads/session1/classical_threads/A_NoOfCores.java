package com.threads.session1.classical_threads;

public class A_NoOfCores {

	public static void main(String[] args) {
		//how to print no of cors in my machine
		int noOfCors=Runtime.getRuntime().availableProcessors();
		System.out.println(noOfCors);
	}
}
