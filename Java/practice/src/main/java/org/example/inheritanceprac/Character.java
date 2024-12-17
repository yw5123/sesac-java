package org.example.inheritanceprac;

// - 다음을 구현하시오.
//    - 이름, 레벨, 체력을 갖는 Character 클래스를 구현하시오.
//        - 레벨은 1부터 시작합니다.
//        - 기본 공격 기능을 구현하시오. (단순 출력)
//        - 레벨업 기능을 구현하시오.
//    - Character 클래스를 상속받는 Warrior 클래스를 작성하시오.
//        - 분노게이지 관련 기능을 추가하시오. (최대 100)
//        - 기본 체력은 120입니다.
//        - 레벨업 시 체력 30 증가
//    - Character 클래스를 상속받는 Mage 클래스를 작성하시오.
//        - 마나 관련 기능을 추가하시오. (최대 100)
//        - 기본 체력은 70입니다.
//        - 레벨업 시 체력 15 증가

public abstract class Character {
     private String name;
     private int level;
     protected int health;
     protected int maxHealth;

     public Character(String name) {
         this.name = name;
         this.level = 1;
         this.health = 100;
         this.maxHealth = 100;
     }

     public void attack() {
         System.out.println("attack!");
     }

     public void levelUp() {
         level += 1;
         System.out.println("level = " + level);
     }
}
