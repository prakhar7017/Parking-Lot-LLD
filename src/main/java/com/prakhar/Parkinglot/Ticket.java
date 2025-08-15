package com.prakhar.Parkinglot;

import java.time.LocalDateTime;

import com.prakhar.vehicles.Vehicle;

public class Ticket {
    private ParkingSpot spot;
    private Vehicle vehicle;
    private LocalDateTime startTime;

    public Ticket(ParkingSpot spot, Vehicle vehicle) {
        this.spot = spot;
        this.vehicle = vehicle;
        this.startTime = LocalDateTime.now();
    }
}
