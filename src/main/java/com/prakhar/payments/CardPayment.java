package com.prakhar.payments;

public class CardPayment implements PaymentsStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Your Card Payment. Take a Breath!!");
    }
}
