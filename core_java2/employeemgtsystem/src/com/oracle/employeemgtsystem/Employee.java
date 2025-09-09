package com.oracle.employeemgtsystem;

abstract public class Employee {
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public abstract double payable();
	
	public void print() {
		System.out.println("employee id: "+ employeeId +" employee name: "+ employeeName);
	}
}
