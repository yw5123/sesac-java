package org.example.inheritanceprac;

// - 다음을 구현하시오.
//    - 모델명, 속도, 연료량을 갖는 Vehicle 클래스를 구현하시오.
//        - 속도 관련 기능을 구현하시오.
//        - 최대 연료량은 100입니다.
//    - Vehicle 클래스를 상속받는 Bus 클래스를 작성하시오.
//        - 승객 관련 기능을 추가하시오.
//        - 최대 연료량은 300입니다.
//    - Vehicle 클래스를 상속받는 Truck 클래스를 작성하시오.
//        - 짐 관련 기능을 추가하시오.
//        - 최대연료량은 250입니다.

public class Vehicle {
    protected String model;
    protected int speed;
    protected int fuel;
    protected static final int MAX_FUEL = 100;

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

    public int decreaseSpeed(int amount) {
        speed -= amount;
        if (speed < 0) speed = 0;
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
