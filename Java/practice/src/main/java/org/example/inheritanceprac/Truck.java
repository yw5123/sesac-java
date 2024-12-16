package org.example.inheritanceprac;

public class Truck extends Vehicle {
    protected static final int MAX_SPEED = 70;
    protected static final int MAX_FUEL = 250;
    private int currentLoad;
    private int maxCapacity;

    public Truck(String model) {
        super(model);
        currentLoad = 0;
        maxCapacity = 300;
    }

//    public boolean loadCargo(int amount) {
//        if ()
//    }
//
//    public boolean unloadCargo(int amount) {
//
//    }
}
