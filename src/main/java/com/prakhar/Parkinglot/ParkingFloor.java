package com.prakhar.Parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNo;
    private List<ParkingSpot>spots;

    public ParkingFloor(int floorNo, int carParkingSpots,int bikeParkingSpots){
        this.floorNo=floorNo;
        this.spots= new ArrayList<>();

        for(int i=0;i<carParkingSpots;i++){
            this.spots.add(new CarParkingSpot(i+1));
        }

        for(int i=carParkingSpots;i<carParkingSpots+bikeParkingSpots;i++){
            this.spots.add(new BikeParkingSpot(i+1));
        }
    }   

    public ParkingSpot findAvailableParkingSpot(String vehicleType){
        for (ParkingSpot spot:spots){
            if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicleType)){
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpots(){
        return spots;
    }
}
