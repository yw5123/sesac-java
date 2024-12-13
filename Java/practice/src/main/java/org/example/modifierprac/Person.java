package org.example.modifierprac;

// - 다음 내용을 바탕으로 Person 클래스를 구현하시오.
//    - 같은 클래스 내에서만 접근할 수 있는 이름(String name) 변수를 작성하시오.
//    - 모든 곳에서 접근할 수 있는 나이(int age) 변수를 작성하시오.
//    - 같은 패키지 내에서만 접근할 수 있는 키(double height) 변수를 작성하시오.
//
//    - 같은 클래스 내에서만 접근할 수 있는 “달리기” 메서드를 작성하시오.
//    - 모든 곳에서 접근할 수 있는 “걷기” 메서드를 작성하시오.
//    - 같은 패키지 내에서만 접근할 수 있는 “공부하기” 메서드를 작성하시오.
//    - 접근할 수 없는 변수를 사용하기 위한 메서드를 작성하시오.
//
//    - Main 클래스에서 Person 객체를 생성하고 각 변수와 메서드에 접근해보시오.
//
//    - 단, 메서드들은 단순 출력으로 구현합니다.

public class Person {
    private String name;
    public int age;
    double height;

    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    private void run() {
        System.out.println("running..");
    }

    public void walk() {
        System.out.println("walking..");
    }

    void study() {
        System.out.println("studying..");
    }

    String getName() {
        return name;
    }
}
