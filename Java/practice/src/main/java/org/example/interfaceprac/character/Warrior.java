package org.example.interfaceprac.character;

public class Warrior extends Character implements RageUsable {
    protected int rage;
    protected int maxRage;

    public Warrior() {
        this.maxHealth = 120;
        this.health = 120;
        this.maxRage = 100;
        this.rage = 0;
    }

    @Override
    public void attack() {
        increaseRage();
        if (rage == maxRage) {
            rageAttack();
        }
        System.out.println("attack!");
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(20);
        increaseRage();
        System.out.println("attack " + target);
        if (rage == maxRage) {
            rageAttack();
            target.takeDamage(40);
        }
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;
    }

    @Override
    public void levelUp() {
        level += 1;
        System.out.println("level up!");
    }

    @Override
    public void increaseRage(int amount) {
        rage = Math.min(maxRage, rage + amount);
    }

    @Override
    public void increaseRage() {
        rage = Math.min(maxRage, rage + 10);
    }

    @Override
    public void rageAttack() {
        rage = 0;
        System.out.println("rage attack!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("rage: " + rage);
    }
}
