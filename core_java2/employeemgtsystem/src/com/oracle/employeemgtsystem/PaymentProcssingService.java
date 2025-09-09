package com.oracle.employeemgtsystem;

import java.util.UUID;

public class PaymentProcssingService {

	public void processPayment(Employee employee) {
		//we will use jdbc latter on
		double paymentValue= employee.payable();
		String paymentId= UUID.randomUUID().toString();
		System.out.println("payement payable: "+ paymentValue+" for payment id : "+ paymentId);
		
	}
}
