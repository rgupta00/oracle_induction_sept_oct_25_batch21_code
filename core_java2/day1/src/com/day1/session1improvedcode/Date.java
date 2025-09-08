package com.day1.session1improvedcode;

public class Date {
	private int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isLeapYear() {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}
	public Date getNextDate() {
		Date nextDate= new Date(day, month, year);
		
		nextDate.day = nextDate.day + 1;
		if (nextDate.day > getNoOfDaysInMonth(nextDate.month, nextDate.year)) {
			nextDate.day = 1;
			nextDate.month = nextDate.month + 1;
			if (nextDate.month > 12) {
				nextDate.month = 1;
				nextDate.year++;
			}
		}
		return nextDate;
	}
	public void incrementDateByOneDay() {
		day = day + 1;
		if (day > getNoOfDaysInMonth(month, year)) {
			day = 1;
			month = month + 1;
			if (month > 12) {
				month = 1;
				year++;
			}
		}
	}
	private int getNoOfDaysInMonth(int month, int year) {
		int daysInMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeapYear()) {
			daysInMonth[2] = 29;
		}
		return daysInMonth[month];
	}
	
	public void printDate() {
		System.out.println(day + " / "+ month +" / "+ year);
	}
	
}
