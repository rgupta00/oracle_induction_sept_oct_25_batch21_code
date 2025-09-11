package com.day5.session3;

import java.util.LinkedList;
import java.util.List;

// super vs extends : generics 
public class B_Extends_Super {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(19);
		list.add(22);
		list.add(21);

		print(list);
		
		
	}
	//<? extends XXX>
	//? extends Object === ?
	private static void print(List<Integer> list) {
		for(Integer temp: list) {
			System.out.println(temp);
		}
	}
	
}










