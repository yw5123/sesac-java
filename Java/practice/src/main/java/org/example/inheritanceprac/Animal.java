package org.example.inheritanceprac;

// - 다음을 구현하시오.
//    - 이름, 나이, 소리내기 기능 갖는 Animal 클래스를 구현하시오.
//    - Animal 클래스를 상속받는 Dog 클래스를 작성하시오.
//        - 소리내기 기능을 오버라이딩 하시오.
//        - 품종 변수를 추가하시오.
//    - Animal 클래스를 상속받는  Cat 클래스를 작성하시오.
//        - 소리내기 기능을 오버라이딩하시오.
//        - 골골대는 기능을 추가하시오.

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " make sound");
    }
}
