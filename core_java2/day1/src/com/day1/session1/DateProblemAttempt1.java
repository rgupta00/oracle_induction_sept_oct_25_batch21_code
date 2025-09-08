package com.day1.session1;

/*
 * find out next date if current date is given
 */
public class DateProblemAttempt1 {

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}

	public static int getNoOfDaysInMonth(int month, int year) {
		int daysInMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeapYear(year)) {
			daysInMonth[2] = 29;
		}
		return daysInMonth[month];
	}

	public static void main(String[] args) {
		int dd, mm, yyyy;
		dd = 31;
		mm = 12;
		yyyy = 2025;
		// i need to take care about leap year
		// i need to keep track of no of days in a month

		System.out.println(dd + " / " + mm + " /" + yyyy);

		dd = dd + 1;
		if (dd > getNoOfDaysInMonth(mm, yyyy)) {
			dd = 1;
			mm = mm + 1;
			if (mm > 12) {
				mm = 1;
				yyyy++;
			}
		}
		System.out.println(dd + " / " + mm + " /" + yyyy);
	}
}
