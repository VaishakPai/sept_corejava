package com.vtech.encapulation;

public class BankRunner {

	public static void main(String args[]) {
		
		Bank bank = new Bank();
		bank.setBalance(100000);
		System.out.println("Balance:" +bank.getBalance());
		
		
	}
}
