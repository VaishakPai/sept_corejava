package com.vtech.inheritanc.bankloan;

public class Runner {

	public static void main(String[] args) {
		HomeLoan h1 = new HomeLoan(500000, 12, 20);
		h1.displayLoanDetails();
		h1.displayTenureYears();

		System.out.println("--------------------------------");
		
		EducationLoan e1 = new EducationLoan(200000, 8, "mba");
		e1.displayCourseName();
		e1.displayLoanDetails();
		
	}

}
