package org.example.interfaceprac;

public class Main {
    public static void main(String[] args) {
        // Shape 클래스
        Shape rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle.calculateArea());  // 200
        rectangle.test();       // test
        rectangle2.test();      // test

        Shape triangle = new Triangle();
        System.out.println(triangle.calculateArea());   // 100


        // Animal 클래스
//        new Animal();   // 불가능
        Dog happy = new Dog("happy", 4, "jindo");
        happy.makeSound();      // bow-wow

        Cat kitty = new Cat("kitty", 2);
        kitty.makeSound();      // meow

        makeThemSound(happy);   // 울어봐! / bow-wow
        makeThemSound(kitty);   // 울어봐! / meow

        kitty.purr();   // grrr
    }

        // 동물마다 함수를 만들어줘야함..
//    public static void makeThemSound(Dog dog) {
//        System.out.println("울어봐!");
//        dog.makeSound();
//    }
//
//    public static void makeThemSound(Cat cat) {
//        System.out.println("울어봐!");
//        cat.makeSound();
//    }

    // Animal을 상속받은 모든 동물 클래스에서 사용 가능
    public static void makeThemSound(Animal animal) {
        System.out.println("울어봐!");
        animal.makeSound();
    }
}
