package com.prakhar.Gates;

import java.time.Duration;
import java.time.LocalDateTime;

import com.prakhar.Parkinglot.ParkingLot;
import com.prakhar.Parkinglot.ParkingSpot;
import com.prakhar.Parkinglot.Ticket;
import com.prakhar.payments.PaymentService;
import com.prakhar.vehicles.Vehicle;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber, Ticket ticket) {
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
        
        // Calculate hours stayed automatically based on ticket's start time
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime startTime = ticket.getStartTime();
        long hoursStayed = Duration.between(startTime, currentTime).toHours();
        // Ensure at least 1 hour is charged
        if (hoursStayed < 1) {
            hoursStayed = 1;
        }
        
        System.out.println("Hours stayed: " + hoursStayed);
        double fee = vehicle.calculateFee((int)hoursStayed);

        paymentService.processPayment(fee);

        parkingLot.vacantSpot(spot, vehicle);
        System.out.println("Spot vacated successfully!");
    }
    
    // Keep the old method for backward compatibility
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
