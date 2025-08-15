package com.prakhar.payments;

public class UpiPayment implements PaymentsStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Your Upi Payment. Take a Breath!!");
    }
}
