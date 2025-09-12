package com.day5.session3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// super vs extends : generics 
class Book{
	private int id;
	private double price;
	public Book(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
public class B_Extends_Super {

	public static void main(String[] args) {
		//List<? extends Number> list5=new LinkedList<Double>();
		
		
		List<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(19);
		list.add(22);
		list.add(21);
		System.out.println("list of ints");
		printMe(list);
		
		List<Double> list2 = new LinkedList<>();
		list2.add(8.0);
		list2.add(19.7);
		list2.add(22.5);
		list2.add(2.99);
		System.out.println("list of doubles");
		printMe(list2);
		
		List<Book> list3 = new LinkedList<>();
		list3.add(new Book(1, 340.00));
		list3.add(new Book(4, 200.00));
		
		printMe(list3);

		
	}
	//hey java i am passing a list whose member have something to do with Number
	//i promise it will only iterate the ds but dont try to change it
	private static void printMe(List<?> list) {
		Iterator<? extends Object> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
}










