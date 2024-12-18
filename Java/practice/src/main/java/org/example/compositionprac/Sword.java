package org.example.compositionprac;

public class Sword extends Weapon {

    public Sword(int ATK) {
        super(ATK);
    }

    @Override
    public void specialAttack() {
        System.out.println("special attack: slash! - " + ATK * 2);
    }
}
