package com.prakhar.vehicles;

public class OtherVehicle extends Vehicle{
    private static final double RATE = 5.0;

    public OtherVehicle(String licensePlate){
        super(licensePlate,"OTHER");
    }

    @Override
    public double calculateFee(int stayedHours){
        return stayedHours*RATE;
    }
}
