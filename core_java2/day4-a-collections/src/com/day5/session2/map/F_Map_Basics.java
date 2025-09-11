package com.day5.session2.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class F_Map_Basics {

	public static void main(String[] args) {
		Map<MyKey, Integer> map=new HashMap<>();
		map.put(new MyKey(1), 67);
		map.put(new MyKey(2), 87);

		System.out.println(map.containsKey(new MyKey(2)));
		
		
		//How to create map
//		Map<String, Integer> map=new TreeMap<>();
//		map.put("raj", 67);
//		map.put("ekta", 87);
//		map.put("sumit", 97);
//		map.put("raj", 88);
//		//map.put(null, 88);
//		System.out.println(map);
		
		//keyset vs entryset
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key + " : "+ map.get(key));
//		}
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for(Entry<String, Integer> e: entrySet) {
//			System.out.println(e.getKey() + " : "+ e.getValue());
//		}
		
		
		//Hashtable vs HashMap
	
		//Entryset
		
	

		// how to print the map
	}
}









