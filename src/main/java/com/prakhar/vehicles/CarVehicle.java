package com.prakhar.vehicles;

public class CarVehicle extends Vehicle {
    private static final double RATE = 30.0;

    public CarVehicle(String licensePlate){
        super(licensePlate,"CAR");
    }

    @Override
    public double calculateFee(int stayedHours){
        return stayedHours*RATE;
    }

}
