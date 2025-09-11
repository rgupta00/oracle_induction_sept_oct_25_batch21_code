package com.day5.session2.list;
import java.util.*;
public class B_ArrayList {

    public static void main(String[] args) {

    	List<Book> books=new ArrayList<>();
    	books.add(new Book(671, "rich dad poor dad", "rk", 200));
    	books.add(new Book(1, "java in action", "abc", 2000));
    	books.add(new Book(6, "spring in action", "pqr", 1000));
    	books.add(new Book(699, "head first core java", "pqr", 1000));
    	
    	
//    	System.out.println("------original listing of the books-------");
//    	printList(books);
//    	Collections.sort(books);
//    	System.out.println("------ books after sorting as per id-------");
//    	printList(books);
//    	
//    	System.out.println("------ books after sorting as per title-------");
//    	Collections.sort(books, new BookSortAsPerTitle());
//    	printList(books);
    	
    	Comparator<Book> comparator=(Book o1, Book o2)-> {
				return o1.getTitle().compareTo(o2.getTitle());
			
		};
		
		
    	
    	System.out.println("------ books after sorting as title-------");
    	Collections.sort(books, comparator);
    	printList(books);
    }

	private static void printList(List<Book> books) {
		Iterator<Book> it=books.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
	}
}
