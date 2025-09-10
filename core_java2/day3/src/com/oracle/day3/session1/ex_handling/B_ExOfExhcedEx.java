package com.oracle.day3.session1.ex_handling;

import java.io.*;
import java.util.*;

public class B_ExOfExhcedEx {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();

		// Decorator design pattern
		System.out.println("start");
		try (BufferedReader br = new BufferedReader(new FileReader(new File("demo.txt")))) {

			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					words.add(token.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println("some other issue in file " + e);
		}
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("end");

	}

}
