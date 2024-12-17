package org.example.interfaceprac.vehicle;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();

        // passengerBoardable 인터페이스 오버라이드
        bus.boardMethod();      // bus: board method

        // vehicle 추상 클래스 오버라이드
        bus.fuelMethod();       // bus: fuel method
        bus.speedMethod();      // bus: speed method


        // Vehicle에 정의된 메서드만 사용 가능
        // 실행할 때는 Bus에 정의된 메서드를 사용
        Vehicle bus2 = new Bus();
//        bus2.boardMethod(); // 불가능
        bus2.fuelMethod();      // bus: fuel method
        bus2.speedMethod();     // bus: speed method


        Truck truck = new Truck();
        truck.lendMethod();     // truck: lend method
        truck.fuelMethod();     // truck: fuel method
        truck.speedMethod();    // vehicle: speed method


        Brucks brucks = new Brucks();
        brucks.lendMethod();    // brucks: lend method
        brucks.boardMethod();   // brucks: board method
        brucks.fuelMethod();    // brucks: fuel method
        brucks.speedMethod();   // vehicle: speed method
    }
}
