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
    private String password;

    // 계좌 생성 (비밀번호 설정)
    BankAccount(String password) {
        this.balance = 0;
        this.password = password;
    }

    // 입금
    public boolean deposit(int amount) {
        // 금액 확인
        if (!validateAmount(amount)) {
            System.out.println("cannot deposit");
            return false;
        }
        balance += amount;
        System.out.println(amount +"won is deposited");
        return true;
    }

    // 출금
    public boolean withdrawal(int amount, String password) {
        // 비밀번호 확인
        if (!validatePassword(password)) {
            System.out.println("invalid password");
            return false;
        }

        // 금액 확인
        if (!validateAmount(amount)) {
            return false;
        }

        // 잔고 확인
        if (amount > balance) {
            System.out.println("cannot withdraw");
            return false;
        }

        System.out.println(amount + "won is withdrawed");
        balance -= amount;
        return true;
    }

    // 잔액 조회
    public int getBalance(String password) {
        if (!validatePassword(password)) {
            System.out.println("invalid password");
            return -1;
        }
        System.out.println("balance: " + balance);
        return balance;
    }

    // 입금 출금 금액 검증
    private boolean validateAmount(int amount) {
        return amount > 0;
    }

    // 비밀번호 검증
    private boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public static boolean validateInitialPassword(String password) {
        if (password.length() >= 4) {
            return true;
        } else {
            System.out.println("password is too short");
            return false;
        }
    }
}
