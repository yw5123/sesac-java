package org.example.inheritanceprac;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": meow");
    }

    public void purr() {
        System.out.println("grrrr");
    }
}
