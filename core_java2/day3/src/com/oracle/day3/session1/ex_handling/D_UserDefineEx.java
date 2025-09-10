package com.oracle.day3.session1.ex_handling;
/*
 * bank app
account
	creating : 10k		AccountCreationException
	deposit:  20L		OverFundException
	withdraw: 14k		NotSufficientFundException
 */
//user define :if u want to create checekd ex: Exception
//	..............................un-----------RuntimeException

class AccountCreationException extends Exception{
	public AccountCreationException(String message) {
		super(message);
	}
}
class Account{
	private int id;
	private String name;
	private double balance;
	private static int counter=0;
	
	public Account( String name, double balance)throws AccountCreationException {
		this.id = ++counter;
		this.name = name;
		
		if(balance<10_000)
			throw new AccountCreationException
			("you dont have sufficient fund to open the account");
		
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public void print() {
		System.out.println("id: "+ id +"name: "+name+" balance: "+ balance);
	}
	
}
public class D_UserDefineEx {

	public static void main(String[] args) {
		Account account;
		
		try {
			account = new Account("ekta", 200_000);
			account.print();
		}catch(AccountCreationException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}










