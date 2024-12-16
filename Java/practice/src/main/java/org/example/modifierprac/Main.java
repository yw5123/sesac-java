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
        String myPassword = "1234";
        BankAccount bankAccount = new BankAccount(myPassword);
        System.out.println(bankAccount.getBalance(myPassword));   // balance: 0 / 0

        // 입금
        bankAccount.deposit(100000);    // 100000won is deposited
        System.out.println(bankAccount.getBalance(myPassword));   // balance: 100000 / 100000

        // 출금 - 비밀번호 오류
        String wrongPassword = "1235";
        bankAccount.withdrawal(10000, wrongPassword);      // invalid password
        System.out.println(bankAccount.getBalance(myPassword));   // balance: 100000 / 100000

        // 입금
        bankAccount.deposit(100000);    // 100000won is deposited
        System.out.println(bankAccount.getBalance(myPassword));   // balance: 200000 / 200000

        // 출금
        bankAccount.withdrawal(40000, myPassword);  // 40000won is withdrawed
        System.out.println(bankAccount.getBalance(myPassword));   // balance: 160000 / 160000


        // 계좌 생성 시비밀번호 검증 등 고려해야 함
        if (BankAccount.validateInitialPassword(myPassword)) {
            BankAccount bankAccount2 = new BankAccount(myPassword);
        } else {
            System.out.println("failed");
        }
    }
}
