package com.vtech.inheritanc.bankloan;

public class EducationLoan extends Loan{

	String courseName; // another child class
	
	EducationLoan(double amount, double interestRate, String courseName) {
		super(amount, interestRate);
		this.courseName = courseName;
		
	}
	
	void displayCourseName() {
		System.out.println("Education Loan for course:" + courseName);
	}

	
}
