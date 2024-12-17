package org.example.interfaceprac.vehicle;

public class Truck extends Vehicle implements CargoLendable {
    @Override
    public void lendMethod() {
        System.out.println("truck: lend method");
    }

    @Override
    void fuelMethod() {
        System.out.println("truck: fuel method");
    }
}
