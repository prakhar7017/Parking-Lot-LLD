package com.prakhar.Parkinglot;

import com.prakhar.vehicles.Vehicle;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(int spotNo) {
        super(spotNo, "CAR");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "CAR".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
