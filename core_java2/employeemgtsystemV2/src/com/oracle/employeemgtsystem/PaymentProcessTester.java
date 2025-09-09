package com.oracle.employeemgtsystem;

public class PaymentProcessTester {

	public static void main(String[] args) {
		Employee employee=new FullTimeEmployee(1, "raja", "AJLKJA123", 6700);
		
		Employee employee2=new PartTimeEmployee(2, "ravi", 69, 15, "ABJKL456");
		
		FreelancerTrainer freelancerTrainer=
				new FreelancerTrainer("abc123", "bca", 670, 12, 5);
	
		PaymentProcssingService paymentProcssingService=new PaymentProcssingService();
		paymentProcssingService.processPayment(employee);
		paymentProcssingService.processPayment(freelancerTrainer);
	}
}
