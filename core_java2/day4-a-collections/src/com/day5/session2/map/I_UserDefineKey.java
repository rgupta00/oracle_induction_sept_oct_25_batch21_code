package com.day5.session2.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

class MyKey{
	private int k;

	public int getK() {
		return k;
	}
	public MyKey(int k) {
		super();
		this.k = k;
	}
	@Override
	public String toString() {
		return "MyKey [k=" + k + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(k);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		return k == other.k;
	}
	

}

public class I_UserDefineKey {
	public static void main(String[] args) {
		
		MyKey key1=new MyKey(1);
		
		MyKey key2=new MyKey(1);
		
		System.out.println(key1.equals(key2));
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
		
		
	}
}












