package com.oracle.employeemgtsystem;

public class FreelancerTrainer implements Payable{
	private String companyRegNumber;
	private String companyName;
	private double ratePerDay;
	private int noOfDays;
	private int rating;
	
	public FreelancerTrainer(String companyRegNumber, String companyName, 
			double ratePerDay, int noOfDays, int rating) {
		this.companyRegNumber = companyRegNumber;
		this.companyName = companyName;
		this.ratePerDay = ratePerDay;
		this.noOfDays = noOfDays;
		this.rating = rating;
	}

	public void print() {
		System.out.println("company reg no: "+ companyRegNumber+" companyName: "+ companyName
				+"ratePerDay: "+ ratePerDay+" noOfDays: "+ noOfDays+" rating: "+rating);
	}

	@Override
	public double payable() {
		return ratePerDay*noOfDays*0.7;
	}
	
	
}
