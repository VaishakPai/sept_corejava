package com.vtech.abstraction.interfaceex;

public class UpiPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of INR: " + amount);
    }
}
