package com.vtech.inter.paymentgateway;

public class OnlinePayment implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing online payment of ₹" + amount);
    }

    public void generateReceipt() {
        System.out.println("Receipt generated for your online payment.");
    }
}
