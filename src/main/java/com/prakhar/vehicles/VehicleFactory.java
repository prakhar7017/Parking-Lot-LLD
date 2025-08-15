package com.prakhar.vehicles;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licensePlate) {
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new CarVehicle(licensePlate);
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new BikeVehicle(licensePlate);
        }
        return null;
    }
}
