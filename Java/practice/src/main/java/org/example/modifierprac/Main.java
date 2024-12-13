package org.example.modifierprac;

// 실습
// - modifierprac 이라는 패키지를 생성하시오.
// - Main 클래스를 생성하고 main 메서드를 작성하시오.

public class Main {
    public static void main(String[] args) {
        // Person
        Person person = new Person("jun", 17, 177.3);
        System.out.println(person.age);     // 17
//        System.out.println(person.name);    //error: name has private access in Person
        System.out.println(person.height);  // 177.3

        System.out.println(person.getName());   // jun

//        person.run();       // error: Run() has private access in Person
        person.walk();      // walking..
        person.study();     // studying..

        // BankAccount
        BankAccount bankAccount = new BankAccount(1234);
        System.out.println(bankAccount.getBalance(1234));   // 0

        // 입금
        bankAccount.deposit(100000);
        System.out.println(bankAccount.getBalance(1234));   // 100000

        // 출금 - 비밀번호 오류
        bankAccount.withdrawal(10000, 1235);
        System.out.println(bankAccount.getBalance(1234));   // 100000

        // 입금
        bankAccount.deposit(100000);
        System.out.println(bankAccount.getBalance(1234));   // 200000

        // 출금
        bankAccount.withdrawal(40000, 1234);
        System.out.println(bankAccount.getBalance(1234));   // 160000
    }
}
