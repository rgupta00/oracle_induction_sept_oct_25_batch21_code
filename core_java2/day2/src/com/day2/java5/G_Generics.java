package com.day2.java5;

import java.util.ArrayList;
import java.util.List;
class Emp{
	
}
public class G_Generics {

	public static void main(String[] args) {
		List<Integer> list =getData();
		Integer data=list.get(0);
		
		System.out.println(data);
		
	}

	
	
	
	
	
	
	
	
	
	
	private static List<Integer> getData() {
		List<Integer> list=new ArrayList<>();
		list.add(123);
	
		return list;
	}
}
