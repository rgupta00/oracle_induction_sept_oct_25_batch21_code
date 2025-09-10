package com.day2.java5;
enum ShirtSize{
	S, M, L, XL, XXL
}
class Shirt {
	private int id;
	private String brand;
	private double price;
	private ShirtSize size;

	public Shirt(int id, String brand, double price, ShirtSize size) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public void print() {
		System.out.println("id " + id + " brand" + brand + " price" 
	+ price + " shirt size " + size);
	}
}

public class E_Enums {

	public static void main(String[] args) {
		// enum: named constant, special class
		Shirt shirt=new Shirt(1, "peter england", 1200, ShirtSize.M);
	}
}
