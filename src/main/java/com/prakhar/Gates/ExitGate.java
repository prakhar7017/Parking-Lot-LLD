package com.prakhar.Gates;

import java.time.LocalDateTime;

import com.prakhar.Parkinglot.ParkingLot;
import com.prakhar.Parkinglot.ParkingSpot;
import com.prakhar.payments.PaymentService;
import com.prakhar.vehicles.Vehicle;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber, int hoursStayed) {
        ParkingSpot spot = parkingLot.getParkingSpotByNo(spotNumber);

        if (spot != null && !spot.isOccupied()) {
            System.out.println("Invalid or vacant spot!");
            return;
        }

        Vehicle vehicle = spot.getVehicle();
        if (vehicle == null) {
            System.out.println("No vehicle found in the spot!");
            return;
        }

        double fee = vehicle.calculateFee(hoursStayed);

        paymentService.processPayment(fee);

        parkingLot.vacantSpot(spot, vehicle);
        System.out.println("Spot vacated successfully!");
    }
}
