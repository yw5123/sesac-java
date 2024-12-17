package org.example.interfaceprac;

public abstract class Vehicle {
    String model;
    int speed;
    int fuel;
    static final int MAX_FUEL = 100;

    public Vehicle(String model) {
        this.model = model;
        this.speed = 0;
        this.fuel = 0;
    }

    public int increaseSpeed(int amount) {
        if (amount <= fuel) {
            speed += amount;
            fuel -= amount;
        }

        return speed;
    }

    public int addFuel(int amount) {
        fuel += amount;
        if (fuel > getMaxFuel()) fuel = getMaxFuel();
        return fuel;
    }

    public int getMaxFuel() {
        return MAX_FUEL;
    }
}
