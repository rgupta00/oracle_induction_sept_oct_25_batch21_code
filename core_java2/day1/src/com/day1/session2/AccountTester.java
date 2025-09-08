package com.day1.session2;

public class AccountTester {

	public static void main(String[] args) {
		Account account1=new Account("ravi",7000);
		account1.print();
		
		Account account2=new Account("anil",7000);
		account2.print();
		
		System.out.println(Account.getNoOfAccounts());
		
		Account account3=new Account();
		account3.print();
		
		System.out.println(Account.getNoOfAccounts());

	}
}
