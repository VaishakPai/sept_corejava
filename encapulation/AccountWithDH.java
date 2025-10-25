package com.vtech.encapulation;

public class AccountWithDH {

	private int balance;
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Amount deposited sucessfully, amount:"+amount);
		}else {
			System.err.println("Invalid deposited, amount:"+amount);
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
}
