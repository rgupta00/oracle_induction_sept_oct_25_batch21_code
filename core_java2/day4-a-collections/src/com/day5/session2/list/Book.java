package com.day5.session2.list;
//Custom sort: comparator

import java.util.Comparator;

class BookSortAsPerPriceAndThenAsPerTitle implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		int value= Double.compare(b2.getPrice(), b1.getPrice());
		if(value==0) {
			value= b1.getTitle().compareTo(b2.getTitle());
		}
		return value;
	}
}


class BookSortAsPerPrice implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		return Double.compare(b2.getPrice(), b1.getPrice());
	}
}

class BookSortAsPerTitle implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
	
}
public class Book implements Comparable<Book>{
	private int id;
	private String title;
	private String author;
	private double price;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}
	public Book() {}
	
	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.id, o.id);
	}

}
