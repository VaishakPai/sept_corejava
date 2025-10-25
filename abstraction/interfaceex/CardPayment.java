package com.vtech.abstraction.interfaceex;

public class CardPayment implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card payment of INR: " + amount);
    }
}
