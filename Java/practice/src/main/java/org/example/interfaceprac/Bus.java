package org.example.interfaceprac;

public class Bus extends Vehicle {
    static final int MAX_FUEL = 300;
    int passengerCount;

    public Bus(String model) {
        super(model);
        this.passengerCount = 0;
    }

    public int addPassenger(int amount) {
        passengerCount += amount;
        return passengerCount;
    }

    @Override
    public int getMaxFuel() {
        return MAX_FUEL;
    }
}
