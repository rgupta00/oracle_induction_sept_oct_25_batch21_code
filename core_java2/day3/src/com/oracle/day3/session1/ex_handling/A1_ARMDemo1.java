package com.oracle.day3.session1.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A1_ARMDemo1 {

	public static void main(String[] args) {
		int x, y, z;
		System.out.println("start");

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("PE two numbers");

			x = scanner.nextInt();

			y = scanner.nextInt();
			z = x / y;
			System.out.println("Z: " + z);

		} catch (InputMismatchException e) {
			System.out.println("pls enter ints only");

		} catch (ArithmeticException e) {
			System.out.println("divide by zero is not allowed");
		}

		System.out.println("end");

	}

}
