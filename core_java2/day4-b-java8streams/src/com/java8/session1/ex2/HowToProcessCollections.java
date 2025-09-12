package com.java8.session1.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HowToProcessCollections {
	public static void main(String[] args) {
		List<String>names=new ArrayList<>();
		names.add("rajiv");
		names.add("ekta");
		names.add("kapil kumar");
		
		names.add("sumit sharma");
		names.add("foo");
		
		names.stream()
		.sorted(( name1,  name2)-> Integer.compare(name2.length(), name1.length()))
		.forEach(name-> System.out.println(name));
		
		//using java 8 map?
		
	}

}
