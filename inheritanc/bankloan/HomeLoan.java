package com.vtech.inheritanc.bankloan;

public class HomeLoan extends Loan{ //child class

	int tenureYears;
	
	HomeLoan(double amount,double interestRate, int tenureYears){
		super(amount, interestRate);
		this.tenureYears = tenureYears;
		
	}
	
	void displayTenureYears() {
		System.out.println("Tenure "+ this.tenureYears + "Years");
	}
	
}
