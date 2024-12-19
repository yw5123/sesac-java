package org.example.inheritance;

import java.util.Objects;

public class Child2 extends Parent2 {
    String name = "beemo";
    int age;
    String gender;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Child2 child = (Child2) o;
        return age == child.age && Objects.equals(name, child.name) && Objects.equals(gender, child.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public void instanceMethod() {
        System.out.println("child instance");
    }

    public static void staticMethod() {
        System.out.println("child static");
    }

    @Override
    public String toString() {
        return name;
    }
}
