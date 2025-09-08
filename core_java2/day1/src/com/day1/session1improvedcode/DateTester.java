package com.day1.session1improvedcode;

public class DateTester {
	public static void main(String[] args) {
		Date date=new Date(28, 2, 2024);
		date.printDate();
		Date newDate=date.getNextDate();
		
		newDate.printDate();
		date.printDate();
		
		
	}

}
