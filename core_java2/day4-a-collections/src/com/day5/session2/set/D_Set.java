package com.day5.session2.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class MyKey implements Comparable<MyKey> {
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

	@Override
	public int compareTo(MyKey o) {
		return Integer.compare(this.k, o.k);
	}
}

public class D_Set {
	public static void main(String[] args) {

		// user define data types
		Set<MyKey> set = new HashSet<>();

		set.add(new MyKey(22));
		set.add(new MyKey(202));
		set.add(new MyKey(11));

		System.out.println(set.contains(new MyKey(202)));

//		//user define data types
//		Set<MyKey> set=new TreeSet<>(new Comparator<MyKey>() {
//			@Override
//			public int compare(MyKey o1, MyKey o2) {
//				return Integer.compare(o2.getK(), o1.getK());
//			}
//		});
//		set.add(new MyKey(22));
//		set.add(new MyKey(202));
//		set.add(new MyKey(11));
//
//		
//		System.out.println(set);

		// set :
		// Set dont allow duplicate
		// HashSet, LinkedHashSet,TreeSet
//		Set<String> set=new TreeSet<>();
//		set.add("foo");
//		set.add("bar");
//		set.add("jar");
//		set.add("car");
//		set.add("jar");
//		
//		System.out.println(set);

	}

}
