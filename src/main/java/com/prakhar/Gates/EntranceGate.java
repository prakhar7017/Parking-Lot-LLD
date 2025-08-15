package com.prakhar.Gates;

import java.util.Scanner;

import com.prakhar.Parkinglot.ParkingLot;
import com.prakhar.Parkinglot.ParkingSpot;
import com.prakhar.vehicles.Vehicle;
import com.prakhar.vehicles.VehicleFactory;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void processEntrance() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the vehicle license plate: ");
        String licensePlate = scanner.next();
        System.out.println("Enter the vehicle type (Car or Bike): ");
        String vehicleType = scanner.next();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType, licensePlate);

        if (vehicle == null) {
            System.out.println("Invalid vehicle type! Only CAR and BIKE are allowed.");
            return;
        }

        ParkingSpot spot = parkingLot.parkVehicle(vehicle);
        if (spot == null) {
            System.out.println("No available spots for the vehicle type.");
        } else {
            System.out.println("Vehicle parked successfully in spot: " + spot.getSpotNo());
        }
    }
}
