package com.vtech.inter.paymentgateway;

public class MainRunner {
    public static void main(String[] args) {
        OnlinePayment payment = new OnlinePayment();
        payment.processPayment(1500.00);   // calls the abstract method implementation
        payment.generateReceipt();         // inherited default method
        PaymentGateway.validatePaymentId(); // static method call on interface
    }
}
