package com.vtech.associations.aggregation.task25102025;

public class Bank {
    Customer customer; // Aggregation
    Account account;   // Composition

    public Bank(Customer customer, int accNo) {
        this.customer = customer;
        this.account = new Account(accNo);
    }

    public void display() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Account Number: " + account.number);
    }
}
