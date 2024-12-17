package org.example.inheritanceprac;

public class Warrior extends Character {
    private int rage;
    private static final int MAX_RAGE = 100;

    public Warrior(String name) {
        super(name);
        this.health = 120;
        this.maxHealth = 120;
        this.rage = 0;
    }

    @Override
    public void attack() {
        System.out.println("attack!");
        rage += 10;

        if (rage >= 50) {
            System.out.println("rage attack!");
        }
    }

    public void rageUp() {
        rage += 50;
        System.out.println("rage up!");
    }

    @Override
    public void levelUp() {
        super.levelUp();
        maxHealth += 30;
        health += 30;
    }
}
