package org.example.inheritanceprac;

public class Mage implements Attackable {
    @Override
    public void attack() {
        // 어차피 오버라이딩해서 Attackable에서의 코드를 사용하지 않는다면 굳이 구현할 필요가 있나?
        // 어떤 변수, 메서드를 필수로 구현해야하는지만 정해두어도 되지 않을까?
        // => 인터페이스
    }
}
