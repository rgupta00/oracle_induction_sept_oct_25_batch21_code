package com.java8.session1.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
public class DemoLambdaExpession2 {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				new Book(121, "java", "raj", 440),
				new Book(181, "java advance", "gunika", 540),
				new Book(11, "python", "ekta", 340),
				new Book(621, "c programming", "gunika", 700)
				);
		
		books.stream().filter(b-> b.getPrice()>=500)
					.sorted(Comparator.comparing(Book::getPrice))
					.map(b-> b.getTitle())
					.forEach(name-> System.out.println(name));
		
		
		//find all all books and print there name if price is greater then 500
		//java 7 impartive ways
//		List<Book> selectedBooks=new ArrayList<>();
//		for(Book b: books) {
//			if(b.getPrice()>=500) {
//				selectedBooks.add(b);
//			}
//		}
//		List<String> booksName=new ArrayList<>();
//		for(Book b: selectedBooks) {
//			booksName.add(b.getTitle());
//		}
//		
//		for(String name: booksName) {
//			System.out.println(name);
//		}
		
		//find all all books and print there name if price is greater then 500
		
		
		
		
		
		
		
		//fluent api
//		List<String> namesOfTheBookThatAreCostly = 
//				books.stream()
//		.filter(b->b.getPrice()>500)
//		.map(b->b.getTitle())
//		.collect(Collectors.toList());
		
		
		//print all books and print there BookDto(name and price) only if price is greater then 500
		
		
		
		
		
		
		//java 8 approach
//		books.stream()
//
//				.filter(b->b.getPrice()>=500)
//
//				.map(b->b.getTitle())
//				.forEach(title-> System.out.println(title));

//		List<String> booksTitle = books.stream()
//				.filter(b -> b.getPrice() >= 500)
//				.map(b -> b.getTitle())
//				.collect(toList());
//
//		booksTitle.forEach(title -> System.out.println(title));


//		List<String> booksName=new LinkedList<>();
//		for(Book b: books){
//			if(b.getPrice()>=500){
//				booksName.add(b.getTitle());
//			}
//		}
//		for(String name: booksName){
//			System.out.println(name);
//		}

	}
}
