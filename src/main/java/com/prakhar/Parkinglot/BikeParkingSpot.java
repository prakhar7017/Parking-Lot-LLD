package com.prakhar.Parkinglot;

import com.prakhar.vehicles.Vehicle;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNo) {
        super(spotNo, "BIKE");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "BIKE".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
