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
	private static final long serialVersionUID = 2531907415000035401L;

	public AccountCreationException(String message) {
		super(message);
	}
}
class NotSufficientFundException extends RuntimeException{
	private static final long serialVersionUID = 2872839064073709432L;

	public NotSufficientFundException(String message) {
		super(message);
	}
}
class OverFundException extends RuntimeException{
	private static final long serialVersionUID = -7867229422668433914L;

	public OverFundException(String message) {
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
		double temp=balance+ amount;
		if(temp>20_00000) {
			throw new OverFundException("u must go for current accont ");
		}
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		//min balance at any time must 10k
		double temp= balance-amount;
		if(temp<10000) {
			throw new NotSufficientFundException("you must have min 10k in your account always");
		}
		balance=temp;
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
			account.withdraw(20_000);
			account.deposit(230_0000);
			
		}catch(AccountCreationException e) {
			System.out.println(e.getMessage());
			
		}catch(OverFundException e) {
			System.out.println(e.getMessage());
		}
		catch(NotSufficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}










