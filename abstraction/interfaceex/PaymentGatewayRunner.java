package com.vtech.abstraction.interfaceex;

public class PaymentGatewayRunner {
    public static void main(String[] args) {

        System.out.println("------ UPI Payment ------");
        PaymentGateway upi = new UpiPaymentGateway();
        upi.processPayment(500);
        upi.generateReceipt(500);

        System.out.println("\n------ Card Payment ------");
        PaymentGateway card = new CardPayment();
        card.processPayment(5000);
        card.generateReceipt(5000);

        System.out.println("\n------ Payment ID Validation ------");
        String paymentId = "PAY1234";
        boolean isValid = PaymentGateway.validatePaymentId(paymentId);
        System.out.println("Is valid ID? " + isValid);
    }
}
