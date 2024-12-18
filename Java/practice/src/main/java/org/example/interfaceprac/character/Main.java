package org.example.interfaceprac.character;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.showInfo();     // level: 1 / hp: 120 / rage: 0

        warrior.attack();       // attack!
        warrior.increaseRage(100);
        warrior.attack();       // attack! / rage attack!

        Mage mage = new Mage();
        mage.showInfo();        // level: 1 / hp: 75

        Warrior warrior2 = new Warrior();
        warrior2.showInfo();    // level: 1 / hp: 120 / rage: 0

        // Character를 상속받았기 때문에 변환돼서 target으로 사용된다고 볼 수 있음!
        // 아니면 damageTakable한 인터페이스(혹은 클래스)를 상속받게 하는 방법도 가능
        // => 캐릭터 외에도 몬스터 등에도 적용 가능
        warrior.attack((Character) warrior2);   // attack org.example.interfaceprac.character.Warrior@681a9515
        warrior.attack(mage);       // attack org.example.interfaceprac.character.Mage@19469ea2
        warrior2.showInfo();        // level: 1 / hp: 100 / rage: 0
        mage.showInfo();            // level: 1 / hp: 45
    }
}
