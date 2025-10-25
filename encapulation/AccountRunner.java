package com.vtech.encapulation;

public class AccountRunner {

	public static void main(String args[]) {
		AccountWithOutDH acc = new AccountWithOutDH();
		
		acc.balance = -5000;
		
		System.out.println("balance: "+acc.balance);
		
		AccountWithDH acc1 = new AccountWithDH();
		acc1.deposit(-5000);
		System.out.println("balance: "+acc1.getBalance());
		
		acc1.deposit(2500);
		System.out.println("balance: "+acc1.getBalance());
	}
	
}
