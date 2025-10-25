package com.vtech.inter.paymentgateway;

public interface PaymentGateway {

    // 1. Abstract method
    void processPayment(double amount);

    // 2. Default method
    default void generateReceipt() {
        System.out.println("Receipt generated successfully.");
    }

    // 3. Static method
    static void validatePaymentId() {
        log("Validating payment ID...");
    }

    // 4. Private method
    private static void log(String msg) {
        System.out.println(msg);
    }
}

