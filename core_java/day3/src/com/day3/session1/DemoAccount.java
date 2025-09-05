package com.day3.session1;
//logic
class Account{
	private int id;
	private String name;
	private double balance;
	
	//init param
	{
		System.out.println("common code");
	}
	{
		System.out.println("common code 2");
	}
	//default ctr
	public Account() {
		
	}
	//para ctr
	public Account(int id, String name, double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	//this is passed only to non static method 
	public void print() {
		System.out.println("id "+ this.id +" name "+
						this.name + " balance "+ this.balance);
	}
	//getter and setter 
	//mutator(setter) imumator(getter)*
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		this.balance=newBalance;
	}
}



//test
public class DemoAccount {
	public static void main(String[] args) {
		Account account=new Account(1,"raj",1000);
		account.print();
		Account account2=new Account(1,"ekta",1000);
		account2.print();
		System.out.println("before change account1: "+account.getBalance());
		account.setBalance(account.getBalance()+100);
		System.out.println("after change account1: "+account.getBalance());
	
		Account account3=new Account();
		account3.print();
	}

}
