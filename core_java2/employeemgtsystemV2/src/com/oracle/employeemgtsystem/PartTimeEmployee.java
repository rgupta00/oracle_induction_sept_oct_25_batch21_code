package com.oracle.employeemgtsystem;

public class PartTimeEmployee extends Employee {

	private double ratePerDay;
	private double noOfDays;
	private String ppfNumber;

	public PartTimeEmployee(int employeeId, String employeeName, double ratePerDay, double noOfDays, String ppfNumber) {
		super(employeeId, employeeName);
		this.ratePerDay = ratePerDay;
		this.noOfDays = noOfDays;
		this.ppfNumber = ppfNumber;
	}

	@Override
	public double payable() {
		return noOfDays * ratePerDay * .8;
	}

	public void print() {
		super.print();
		System.out.println("ratePerDay: " + ratePerDay + " noOfDays: " + noOfDays + " ppfNumber: " + ppfNumber);
	}

}
