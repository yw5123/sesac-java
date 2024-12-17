package org.example.interfaceprac;

public class Cat extends Animal implements Purrable {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void purr() {
        System.out.println("grrr");
    }
}
