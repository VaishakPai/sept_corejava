package com.vtech.inheritanc.bankloan;

public class Loan { // parent class

	double amount;
	double interestRate;
	
	Loan(double amount, double interestRate){
		this.amount = amount;
		this.interestRate = interestRate;
	}
	
	void displayLoanDetails() {
		System.out.println("Loan Amount"+this.amount);
		System.out.println("Interest rate:"+ this.interestRate + "%");
		
	}
	
}
