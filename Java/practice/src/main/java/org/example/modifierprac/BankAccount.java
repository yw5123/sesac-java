package org.example.modifierprac;

// - 다음 내용을 바탕으로 BankAccount 클래스를 구현하시오.
//    - 계좌는 잔액과 비밀번호 정보를 가진다.
//    - 잔액과 비밀번호는 외부에서 직접 접근할 수 없다.
//
// - 다음 기능을 수행할 수 있다.
//    - 계좌 생성 (비밀번호 설정)
//    - 입금
//    - 출금 (비밀번호 확인 필요)
//    - 잔액 조회 (비밀번호 확인 필요)
//
// 단, 입금이나 출금시 0원 이하의 금액은 불가능하며,
// 잔액보다 큰 금액은 출금할 수 없다.

public class BankAccount {
    private int balance;
    private int password;

    BankAccount(int password) {
        this.balance = 0;
        this.password = password;
    }

    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }

    public boolean withdrawal(int amount, int password) {
        // 1. 패스워드가 일치하거나
        // 2. 남은 예금이 출금할 금액보다 많으면
        // 3. 출금
        if (this.password == password && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance(int password) {
        if (this.password == password) {
            return balance;
        }
        return -1;
    }
}
