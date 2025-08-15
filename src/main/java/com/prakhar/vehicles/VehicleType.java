package com.prakhar.vehicles;

public enum VehicleType {
    CAR("Car"),
    BIKE("Bike"),
    OTHER("Other");

    private final String type;

    VehicleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
