package org.example.inheritanceprac;

public class Bus extends Vehicle {
    protected static final int MAX_FUEL = 300;
    private static final int MAX_PASSENGER = 100;
    private int passengerCount;

    public Bus(String model) {
        super(model);
        this.passengerCount = 0;
    }

    public boolean getOn(int num) {
        if (passengerCount + num > MAX_PASSENGER) {
            // 탑승하지 못한 승객 발생
            System.out.println(passengerCount + num - MAX_PASSENGER + "명의 승객이 탑승하지 못했습니다.");
            passengerCount = MAX_PASSENGER;
            return false;
        }

        System.out.println("승객들이 모두 탑승했습니다.");
        passengerCount += num;

        return true;
    }

    public boolean getOff(int num) {
        if (passengerCount - num < 0) {
            System.out.println("현재 탑승중인 승객보다 많이 하차할 수 없습니다.");
            return false;
        }
        System.out.println(num + "명의 승객이 하차했습니다.");
        passengerCount -= num;
        return true;
    }

    @Override
    public int getMaxFuel() {
        return MAX_FUEL;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
