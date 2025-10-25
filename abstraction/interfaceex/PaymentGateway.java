package com.vtech.abstraction.interfaceex;

public interface PaymentGateway {

    // 1. Abstract method
    void processPayment(double amount);

    // 2. Default method
    default void generateReceipt(double amount) {
      //  log("Generating Receipt....");
        System.out.println("Thanks for shopping with us, total amount is: " + amount);
    }

    // 3. Static method
    static boolean validatePaymentId(String id) {
     //   log("Validating Payment ID...");
        return id != null && id.startsWith("PAY") && id.length() > 5;
    }

//    // 4. Private helper method
//    private static void log(String msg) {
//        System.out.println("[Payment log] " + msg);
//    }
}
