package com.day5.session1.object_class;

public class BookTester {

	public static void main(String[] args) {
		Book book=new Book(1, "effective java", "abc", 340);
		Book book2=new Book(1, "effective java", "abc", 340);
		
		if(book.equals(book2)) {
			System.out.println("are eq");
		}else {
			System.out.println("not eq");
		}
	}
}
