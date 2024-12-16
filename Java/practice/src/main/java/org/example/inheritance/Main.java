package org.example.inheritance;

public class Main {
    public static void main(String[] args) {
        // Person Student
        Person.introduce();     // hello
        Student.introduce();    // hello, i'm student

        Student s = new Student();
        s.study();      // studying..


        // Parent Child
        Parent parent = new Parent("parentPublicValue");
        System.out.println(parent.publicValue);     // parentPublicValue

        // private 변수는 접근 불가능
//        System.out.println(parent.privateValue);

        System.out.println(parent.protectedValue);  // protectedValue
        parent.publicMethod();      // publicMethod

        Child child = new Child("childPublicValue");
        System.out.println(child.publicValue);      // childPublicValue
        System.out.println(child.protectedValue);   // protectedValue
        child.publicMethod();       // protectedValue / childPublicMethod
        child.childMethod();        // childMethod

        // 부모 클래스에서는 호출 불가능
//        parent.childMethod();
    }
}
