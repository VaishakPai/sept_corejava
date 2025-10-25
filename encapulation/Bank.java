package com.vtech.encapulation;

public class Bank {

	private double balance;
	
	public void setBalance(double balance) {
		if(balance >0) {
			this.balance = balance;
		} else {
			System.err.println("Invalid transcation");
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
}
