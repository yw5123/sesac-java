package org.example.exceptionprac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println( 0 / 0 );
        } catch (ArithmeticException e) {
            System.out.println("error 발생");        // error 발생
            System.out.println(e.getMessage());     // / by zero
            e.printStackTrace();    // java.lang.ArithmeticException: / by zero
                                    // at org.example.exceptionprac.Main.main(Main.java:6)
            // printStackTrace()는 개발할 때만 사용하는 게 좋음 (배포 시 x)

        }


        try {
            // 문제 상황이 발생했다고 가정
            if (true) {
                throw new RuntimeException("error message");
            }
        } catch (RuntimeException e) {
            System.out.println("runtime error");    // runtime error
            System.out.println(e.getMessage());     // error message
        }


//        // main 메서드에 throws로 예외 선언
//        // 메서드에서 이런 예외가 발생할 수 있으니 처리해야 한다고 명시 - checked 에러 발생 시 사용
//        Files.readString(Paths.get("src/main/resource"));


        try {
            func();      // func 실행
        } catch (RuntimeException e) {
            System.out.println("error in func");    // error in func
        }

    }

    public static void func() {
        System.out.println("func 실행");

        throw new RuntimeException("func error");
    }
}
