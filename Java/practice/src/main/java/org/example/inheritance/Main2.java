package org.example.inheritance;

public class Main2 {
    public static void main(String[] args) {
        Child2 c1 = new Child2();
        Parent2 c2 = new Child2();

        c1.instanceMethod();    // child instance
        c2.instanceMethod();    // child instance

        // static은 다형성을 적용받지 않음
        c1.staticMethod();      // child static
        c2.staticMethod();      // parent static

        System.out.println(c1);     // beemo
    }
}
