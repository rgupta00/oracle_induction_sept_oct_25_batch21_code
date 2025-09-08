package com.day1.session2;

public class Account {
	private int id;
	private String name;
	private double balance;
	private static int counter=0;
	
	//ctr chaining
	public Account() {
		this("foo",0.0);
	}
	public Account(String name, double balance) {

		this.id=++counter;
		this.name=name;
		this.balance=balance;
	}
	public void print() {
		System.out.println("id: "+ id + " name: "+ name+" balance: "+ balance);
	}
	//getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	//setter : balance
	public void setBalance(double newBalance) {
		this.balance=newBalance;
	}
	//static method dont have this ref so it cant access instance variable 
	public static int getNoOfAccounts() {
		return counter;
	}
}
