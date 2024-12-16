package org.example.inheritance;

public class Student extends Person {
    // 상속(확장)하면 부모 클래스의 변수와 메서드 사용 가능
//    String name;
//    int age;
    int studentNum;

    // 메서드 오버라이딩
    // 부모에게서 받은 메서드를 덮어씌울 수 있음
    public static void introduce() {
        System.out.println("hello, i'm student");
    }

    public void study() {
        System.out.println("studying..");
    }
}
