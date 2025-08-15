package com.prakhar.payments;

public class Payment {
    private double amount;
    private PaymentsStrategy paymentsStrategy;

    public Payment(double amount, PaymentsStrategy paymentsStrategy) {
        this.amount = amount;
        this.paymentsStrategy = paymentsStrategy;
    }

    public void processPayment() {
        if (amount > 0) {
            paymentsStrategy.processPayment(amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
}
