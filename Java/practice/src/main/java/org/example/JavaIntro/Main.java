package org.example.JavaIntro;

public class Main {
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();

        // private으로 설정한 변수, 메서드는 접근이 불가능!
        System.out.println(pm.publicNum);           // 1
//        System.out.println(pm.privateNum);      // error: privateNum has private access in PrivateModifier
        System.out.println(pm.getPrivateNum());     // 10
        pm.setPrivateNum(100);
        System.out.println(pm.getPrivateNum());     // 100


        pm.publicHi();          // hi, public
//        pm.privateHi();     // error: privateHi() has private access in PrivateModifier
    }
}
