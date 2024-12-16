package org.example.inheritance;

public class Child extends Parent {
    public String childValue = "childValue";

    public Child(String publicValue) {
        super(publicValue);
    }

    public Child(String publicValue, String childValue) {
        super(publicValue);
        this.childValue = childValue;
    }

    public void childMethod() {
        System.out.println("childMethod");
    }

    // 함수 오버라이딩
    @Override
    public void publicMethod() {
        // super를 이용해 부모 클래스의 변수나 메서드 참조 가능
        super.publicMethod();
        System.out.println(super.protectedValue);
        System.out.println("childPublicMethod");
    }
}
