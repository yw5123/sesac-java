package org.example;

// 클래스 실습 - 실습 + 코드 리뷰

// 같은 파일에 class 여러개 만들면 안 좋지만
// 파일이 너무 많아져서 그냥 한 파일에 작성함(..)

public class Practice1212 {
    public static void main(String[] args) {
        // Person
        // 이름이 jun이고 나이가 18살인 인스턴스 생성
        Person jun = new Person("jun", 18);
        Person jun2 = new Person("jun", 18);
        System.out.println(jun.name);   // jun
        System.out.println(jun.age);    // 18
        System.out.println(jun == jun2);    // false => jun과 jun2는 다른 객체

        // Dog
        Dog happy = new Dog("Jindo", "Happy");
        happy.sitDown();    // Happy, sit down
        happy.giveHand();   // Happy, hand

        // Triangle
        Triangle smallTriangle = new Triangle(4);
        System.out.println(smallTriangle.circumference);     // 12
        System.out.println(smallTriangle.calculateArea());   // 7 혹은 6.93 (주석 처리한 방법에 따라)

        // Car
        Car myCar = new Car("Avante");
        myCar.showInfo();    // CAR <Avante>'s speed is 0
        myCar.speedUp();
        myCar.speedUp();
        myCar.speedUp();
        myCar.speedDown();
        myCar.showInfo();    // CAR <Avante>'s speed is 20

        // MP3Player
        MP3Player iPod = new MP3Player("iPod");
        iPod.showInfo();     // MP3 <iPod> (Off) - volume: 0
        iPod.pushPowerButton();
        iPod.volumeUp();
        iPod.volumeUp();
        iPod.volumeUp();
        iPod.volumeDown();
        iPod.showInfo();     // MP3 <iPod> (On) - volume: 80
        iPod.pushPowerButton();
        iPod.showInfo();     // MP3 <iPod> (Off) - volume: 0

        // Calculator
        Calculator cal = new Calculator(10, 4);
        System.out.println(cal.add());  // 14
        System.out.println(cal.sub());  // 6
        System.out.println(cal.mul());  // 40
        System.out.println(cal.div());  // 2.5
    }
}

//이름, 나이를 가지고 있는 Person 클래스를 구현하시오.
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 견종, 이름을 가지고, “앉아”, “손”을 할 수 있는 Dog 클래스를 구현하시오.
class Dog {
    String breed;
    String name;

    Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    // 아무것도 입력 안 받을 거임 / 손을 출력할 거임 / 아무것도 return 안 할 거임
    // 함수 만들기 전에 미리 생각하고 만드는 것이 "무조건" 좋다
    void sitDown() {
        System.out.println(name + ", sit down");
    }

    void giveHand() {
        System.out.println(name + ", hand");
    }
}

// 다음을 바탕으로 Triangle 클래스를 구현하시오.
// 삼각형의 둘레 길이, 넓이를 계산할 수 있다.
// 정삼각혁이라고 가정
class Triangle {
    int side;
    int circumference;

    public Triangle(int side) {
        this.side = side;
        this.circumference = side * 3;
    }

    double calculateArea() {
//        return Math.round(Math.sqrt(3) / 4 * side * side);

        // 소숫점 2자리수까지 반영하고 싶으면 이런 식으로 작성 가능
        double area = (Math.sqrt(3) / 4 * side * side);
        double formattedArea = (double) Math.round(area * 100) / 100;
        return formattedArea;
    }
}

// - 다음을 구현하시오.
//    - 아래 내용을 바탕으로 `Car` 클래스를 구현하시오.
//        - 다음 속성들을 변수로 갖는다.
//            - 모델명
//            - 속도
//        - 다음 기능들을 메서드로 갖는다.
//            - 속도 증가 - 속도 10 증가
//            - 속도 감소 - 속도 10 감소
//            - 정보 조회 - 모델명과 현재 속도 조회
//
//    - 구현한 `Car` 클래스를 이용하여 다음 작업을 수행하시오.
//        - 모델명이 ”Avante”인 자동차 인스턴스를 생성하시오.
//        - 가속을 3번 수행하시오.
//        - 브레이크를 1번 수행하시오.
//        - 최종 자동차 정보를 출력하시오.
class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    int speedUp() {
        speed += 10;

        return speed;
    }

    int speedDown() {
        if (speed > 0) speed -= 10;
        return speed;
    }

    void showInfo() {
        System.out.println("CAR <" + model + ">'s speed is " + speed);

        // 포멧팅
        // System.out.printf("model: %s / speed: $d\n", model, speed);
    }
}

// - 다음을 구현하시오.
//    - 아래 내용을 바탕으로 `MP3Player` 클래스를 구현하시오.
//        - 다음 속성들을 변수로 갖는다.
//            - 모델명
//            - 볼륨
//            - 전원이 켜져있는지 여부
//        - 다음 기능들을 메서드로 갖는다.
//            - 전원 켜기 - 전원을 키고, 볼륨을 40으로 설정
//            - 전원 끄기 - 전원을 끄고, 볼륨을 0으로 설정
//            - 볼륨 증가 - 볼륨 20 증가 (최대 100)
//            - 볼륨 감소 - 볼륨 20 감소 (최소 0)
//            - 정보 조회
//    - 구현한 `MP3Player` 클래스를 이용하여 다음 작업을 수행하시오.
//        - model이 "iPod"인 MP3 플레이어 인스턴스를 생성하시오.
//        - 볼륨을 3번 올리시오.
//        - 볼륨을 1번 내리시오.
//        - 최종 MP3 플레이어 정보를 출력하시오.
class MP3Player {
    String model;
    int volume;
    boolean isTurnedOn;

    MP3Player(String model) {
        this.model = model;
        this.volume = 0;
        this.isTurnedOn = false;
    }

    boolean pushPowerButton() {
        if (isTurnedOn) return this.turnOff();
        else return this.turnOn();
    }

    boolean turnOn() {
        isTurnedOn = true;
        volume = 40;

        return isTurnedOn;
    }

    boolean turnOff() {
        isTurnedOn = false;
        volume = 0;

        return false;
    }

    int volumeUp() {
        if (!isTurnedOn) return 0;

        volume += 20;
        if (volume > 100) volume = 100;

        return volume;
    }

    int volumeDown() {
        if (!isTurnedOn) return 0;

        volume -= 20;
        if (volume < 0) volume = 0;

        return volume;
    }

    void showInfo() {
        System.out.println("MP3 <" + model +"> (" + (isTurnedOn ? "On" : "Off") + ") - volume: " + volume);
    }
}

// - 두 정수를 활용하여 이항연산을 할 수 있는 계산기 클래스를 구현하시오.
//    - 단, 두 정수는 계산기가 생성될 때 입력된다.
class Calculator {
    int num1;
    int num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add() {
        return num1 + num2;
    }

    int sub() {
        return num1 - num2;
    }

    int mul() {
        return num1 * num2;
    }

    double div() {
        return (double) num1 / num2;
    }
}
