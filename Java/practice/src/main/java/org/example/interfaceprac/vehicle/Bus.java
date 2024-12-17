package org.example.interfaceprac.vehicle;

public class Bus extends Vehicle implements PassengerBoardable {
    @Override
    public void boardMethod() {
        System.out.println("bus: board method");
    }

    @Override
    void fuelMethod() {
        System.out.println("bus: fuel method");
    }

    @Override
    void speedMethod() {
        System.out.println("bus: speed method");
    }
}
