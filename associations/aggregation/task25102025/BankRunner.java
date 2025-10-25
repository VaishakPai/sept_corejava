package com.vtech.associations.aggregation.task25102025;

public class BankRunner {
    public static void main(String[] args) {
        Customer customer = new Customer("Ravi");
        Bank bank = new Bank(customer, 12345);
        bank.display();
    }
}
