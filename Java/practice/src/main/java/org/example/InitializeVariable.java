package org.example;

public class InitializeVariable {
    public static void main(String[] args) {
        // 변수를 초기화하는 방법들

        V1 v1 = new V1();
        System.out.println(v1.value);   // 10

        V2 v2 = new V2();
        System.out.println(v2.value);   // 10

        V3 v3 = new V3();
        System.out.println(v3.value);   // 10
    }
}

class V1 {
    int value = 10;
    String word = "text";
}

class V2 {
    int value;
    String word;

    public V2() {
        this(10, "text");
    }

    public V2(int value, String word) {
        this.value = value;
        this.word = word;
    }
}

class V3 {
    int value;
    String word;

    // 초기화 블록: 변수를 초기화하는 블록
    // 복잡한 초기화를 위해 사용
    {
        // if, for 등 사용 가능
        if (true) {
            this.value = 10;
        } else {
            this.value = 12;
        }
        this.word = "text";
    }
}