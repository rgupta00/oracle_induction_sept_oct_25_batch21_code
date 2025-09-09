package com.oracle.employeemgtsystem;

public class FullTimeEmployee extends Employee{
	private String ppfNumber;
	private double baseSalary;
	
	public FullTimeEmployee(int employeeId, String employeeName, 
				String ppfNumber, double baseSalary) {
		super(employeeId, employeeName);
		this.ppfNumber = ppfNumber;
		this.baseSalary = baseSalary;
	}

	@Override
	public double payable() {
		return baseSalary*10*0.7;
	}
	
	public void print() {
		super.print();
		System.out.println("ppfNumber: "+ ppfNumber +" baseSalary: "+ baseSalary);
	}
}
