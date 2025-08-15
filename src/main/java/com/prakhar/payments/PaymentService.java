package com.prakhar.payments;

import java.util.Scanner;

public class PaymentService {
    private Scanner scanner;

    public PaymentService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void processPayment(double fee) {
        choosePaymentMethod(fee);
    }

    void choosePaymentMethod(double fee) {
        System.out.println("Total Fee: " + fee);
        System.out.println("Choose Payment Method");
        System.out.println("Choose Payment Method");
        System.out.println("1. Cash Payment");
        System.out.println("2. Card Payment");
        System.out.println("3. Upi Payment");

        int choice = scanner.nextInt();
        Payment payment;
        switch (choice) {
            case 1:
                payment = new Payment(fee, new CashPayment());
                break;
            case 2:
                payment = new Payment(fee, new CardPayment());
                break;
            case 3:
                payment = new Payment(fee, new UpiPayment());
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Cash payment.");
                payment = new Payment(fee, new CashPayment());
                break;
        }
        payment.processPayment();
    }
}
