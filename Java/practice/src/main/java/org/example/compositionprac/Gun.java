package org.example.compositionprac;

public class Gun extends Weapon {

    public Gun(int ATK) {
        super(ATK);
    }

    public void specialAttack() {
        System.out.println("special attack: shoot! - " + ATK * 3);
    }
}
