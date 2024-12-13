package org.example;

// 같은 파일에 class 여러개 만들면 안 좋지만
// 파일이 너무 많아져서 그냥 한 파일에 작성함(..)

// 패키지(다른 폴더에 있는 파일)의 class를 사용하려면 import 해야 함
import org.example.JavaIntro.Dog2;
import org.example.practice.Coffee;
import org.example.practice.Bread;

//// 이렇게 한번에 import 해올 수도 있음
//// 하지만 불필요한 class까지 가져올 수도..
//import org.example.practice.*;

//// Coffee class 안에 있는 모든 변수, 메서드를 import 해서 사용할 수도 있음
//import static org.example.practice.Coffee.*;


public class Main1213 {
    public static void main(String[] args) {
        // 계산기 static
        Calculator2 cal2 = new Calculator2();
        Calculator2 cal3 = new Calculator2();
        System.out.println(cal2.add(10, 4));    // 14
        System.out.println(cal2.sub(30, 12));   // 18

        System.out.println(Calculator2.staticAdd(10, 4));   // 14
//        System.out.println(Calculator2.add(10,4)); // add()는 인스턴스 메서드라 이렇게 사용할 수 X

        // Rectangle static
        Rectangle2 rectangle = new Rectangle2(10, 30);
        System.out.println(Rectangle2.angleCount);  // 4
        Rectangle2.angleCount = 10;
        System.out.println(rectangle.angleCount);   // 10
        System.out.println(Rectangle2.angleCount);  // 10

//        // Dog static
//        Dog2 poppy = new Dog2("puddle", "poppy");
//        System.out.println(Dog2.count);     // 1
//        Dog2 poppyJunior = new Dog2("puddle", "poppy");
//        System.out.println(Dog2.count);     // 2

        // Person 생성자
        Person2 p1 = new Person2();
        Person2 p2 = new Person2("kyle", 19);
        System.out.println(p1.name);    // default name
        System.out.println(p2.name);    // kyle

        // Coffee 패키지
        Coffee.taste();     // tastes good!
        Bread.taste();

        // Dog2 class를 JavaIntro 패키지로 옮겨보기
        Dog2 poppy = new Dog2("puddle", "poppy");
        System.out.println(Dog2.count);     // 1
        Dog2 poppyJunior = new Dog2("puddle", "poppy");
        System.out.println(Dog2.count);     // 2
    }
}

class Calculator2 {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    static int staticAdd(int num1, int num2) {
        return num1 + num2;
    }

    int sub(int num1, int num2) {
        return num1 - num2;
    }

    int mul(int num1, int num2) {
        return num1 * num2;
    }

    double div(int num1, int num2) {
        return (double) num1 / num2;
    }
}

class Rectangle2 {
    static int angleCount = 4;
    int width;
    int height;

    Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }
}

//class Dog2 {
//    static int count;
//    String breed;
//    String name;
//
//    Dog2(String breed, String name) {
//        this.breed = breed;
//        this.name = name;
//        count++;
//    }
//
//    // 아무것도 입력 안 받을 거임 / 손을 출력할 거임 / 아무것도 return 안 할 거임
//    // 함수 만들기 전에 미리 생각하고 만드는 것이 "무조건" 좋다
//    void sitDown() {
//        System.out.println(name + ", sit down");
//    }
//
//    void giveHand() {
//        System.out.println(name + ", hand");
//    }
//}

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 직접 기본값을 설정하고 싶을 때
//    public Person2() {
//        name = "default name";
//        age = 18;
//    }

    // 두 생성자 모두 인스턴스 변수를 초기화하는 중복을 제거하기 위해
    // this() 를 사용할 수 있음!
    // +) this() 를 사용할 때는 생성자 내에서 가장 첫 줄에 호출
    public Person2() {
        this("default name", 18);
    }
}