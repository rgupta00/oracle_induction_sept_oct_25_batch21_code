package com.oracle.employeemgtsystem;

abstract public class Employee implements Payable{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
	public void print() {
		System.out.println("employee id: "+ employeeId +" employee name: "+ employeeName);
	}
}
