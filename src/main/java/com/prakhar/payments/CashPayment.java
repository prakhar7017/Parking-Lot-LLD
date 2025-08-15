package com.prakhar.payments;

public class CashPayment implements PaymentsStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Your Cash Payment. Take a Breath!!");
    }
}
