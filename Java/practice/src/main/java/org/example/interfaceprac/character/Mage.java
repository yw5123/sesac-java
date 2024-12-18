package org.example.interfaceprac.character;

public class Mage extends Character {

    public Mage() {
        this.maxHealth = 75;
        this.health = 75;
    }

    @Override
    public void attack() {

    }

    @Override
    public void attack(Character target) {
        target.takeDamage(20);
        System.out.println("attack " + target);
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount + 10;
    }

    @Override
    public void levelUp() {
        level += 1;
        System.out.println("level up!");
    }
}
