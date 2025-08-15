package com.prakhar.Parkinglot;

import com.prakhar.vehicles.Vehicle;

public abstract class ParkingSpot {
    private int spotNo;
    private boolean isOccupied;
    private String spotType;
    private Vehicle vehicle;

    public ParkingSpot(int spotNo, String spotType) {
        this.spotNo = spotNo;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            throw new IllegalStateException("Spot is already Occupied.");
        }
        if(!canParkVehicle(vehicle)){
            throw new IllegalStateException("Cannot Park" + vehicle.getVehicleType() + "on spot "+ spotType);
        }
        this.vehicle=vehicle;
        this.isOccupied=true;
    }

    public void vacant(){
        if(!isOccupied){
            throw new IllegalStateException("Spot is already vacant.");
        }
        this.vehicle=null;
        this.isOccupied=false;
    }

    public int getSpotNo(){
        return spotNo;
    }
    
    public String getSpotType(){
        return spotType;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    @Override
    public String toString(){
        return "ParkingSpot{" +
                "spotNumber=" + spotNo +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + (vehicle != null ? vehicle.getLicensePlate() : "None") +
                '}';
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

}
