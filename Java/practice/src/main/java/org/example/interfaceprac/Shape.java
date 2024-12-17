package org.example.interfaceprac;

// 추상 클래스
public abstract class Shape {
    public int width;
    public int height;

    public abstract int calculateArea();

    public void test() {
        System.out.println("test");
    }
}
