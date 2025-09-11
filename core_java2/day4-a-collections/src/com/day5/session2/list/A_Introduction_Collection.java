package com.day5.session2.list;

import java.util.*;

public class A_Introduction_Collection {

	public static void main(String[] args) {
		// List, how to create list and display all elements

		List<String> list = new LinkedList<>();
		list.add("raj");
		list.add("ekta");
		list.add("gunika");
		list.add("keshav");
		list.add("amit");
		list.add("apple");
		list.add("orange");
		
		System.out.println(list);
		Collections.sort(list);
		int pos=Collections.binarySearch(list, "apple");
		
		System.out.println(list);
		System.out.println(pos);
		
//		list.subList(1, 3).clear();
//
//		System.out.println(list);

//		for(String name: list) {
//			System.out.println(name);
//		}

		// Using iterator: 3 kind of iterator in java
		// Iterator, ListIterator, Enumerator

//		ListIterator<String> it=list.listIterator(list.size());
//		while(it.hasPrevious()) {
//			String value=it.previous();
//			System.out.println(value);
//		}
//		

		// binary search

		// using ListIterator
	}
}
