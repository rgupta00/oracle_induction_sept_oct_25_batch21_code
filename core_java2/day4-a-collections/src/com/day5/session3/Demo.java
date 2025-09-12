package com.day5.session3;
import java.util.*;
class Dog1{
	void sound() {
		System.out.println("bho bho");
	}
}
public class Demo {

	public static void main(String[] args) {
		List<Integer> list=getList();
		int val=list.get(0);
		
	}
	
	
	
	public static List<Integer> getList() {
		List<Integer>  list=new ArrayList<>();
		list.add(2);
		return list;
	}
}
