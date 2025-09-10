package com.oracle.day3.session1.ex_handling.mcq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Mcq2 {
	
	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("demo.text")));
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					words.add(token.toLowerCase());
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
		
	}

}
