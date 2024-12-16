package org.example.inheritanceprac;

// 실습 및 코드 리뷰

public class Main {
    public static void main(String[] args) {
        // Animal 클래스
        Animal animal = new Animal("animal", 3);
        animal.makeSound();     // animal make sound

        Dog puppy = new Dog("puppy", 2, "jindo");
        puppy.makeSound();      // puppy: bow-wow

        Cat kitten = new Cat("kitten", 1);
        kitten.makeSound();     // kitten: meow
        kitten.purr();          // grrrr

        
        // Vehicle 클래스
        Vehicle vehicle = new Vehicle("car");
        vehicle.addFuel(200);
        System.out.println("현재 연료량은 " + vehicle.fuel);  // 현재 연료량은 100
        vehicle.increaseSpeed(30);
        System.out.println("현재 속도는 " + vehicle.speed);  // 현재 속도는 30
        vehicle.decreaseSpeed(20);
        System.out.println("현재 속도는 " + vehicle.speed);  // 현재 속도는 10

        Bus bus = new Bus("bus");
        bus.addFuel(200);
        System.out.println("현재 연료량은 " + bus.fuel);      // 현재 연료량은 200
        bus.increaseSpeed(40);
        System.out.println("현재 속도는 " + bus.speed);  // 현재 속도는 40
        bus.decreaseSpeed(10);
        System.out.println("현재 속도는 " + bus.speed);  // 현재 속도는 30
        bus.getOn(13);      // 승객들이 모두 탑승했습니다.
        System.out.println("현재 탑승한 승객 수는 " + bus.getPassengerCount());     // 현재 탑승한 승객 수는 13

        // 예외 처리 확인
        bus.getOff(14);     // 현재 탑승중인 승객보다 많이 하차할 수 없습니다.
        bus.getOn(91);      // 4명의 승객이 탑승하지 못했습니다.
        System.out.println("현재 탑승한 승객 수는 " + bus.getPassengerCount());     // 현재 탑승한 승객 수는 100
    }
}
