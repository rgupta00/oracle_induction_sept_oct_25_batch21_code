package com.oracle.employeemgtsystem;

public class FreelancerTrainer extends Employee{


	private String companyRegNumber;
	private String companyName;
	private double ratePerDay;
	private int noOfDays;
	private int rating;
	
	public FreelancerTrainer(int employeeId, String employeeName) {
		super(employeeId, employeeName);
	}

	
	@Override
	public double payable() {
		return 0;
	}
	
	
}
