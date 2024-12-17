package org.example.interfaceprac.vehicle;

// Bus를 상속받는다고 생각할 수 있지만
// 비슷하다고 의존 관계를 만들면 예상하지 못한 문제가 발생할 수 있음
// 느슨한 연결 관계를 갖는 게 좋음(더 자세하게는 내일)

public class Brucks extends Vehicle implements CargoLendable, PassengerBoardable {
    @Override
    public void lendMethod() {
        System.out.println("brucks: lend method");
    }

    @Override
    public void boardMethod() {
        System.out.println("brucks: board method");
    }

    @Override
    void fuelMethod() {
        System.out.println("brucks: fuel method");
    }
}
