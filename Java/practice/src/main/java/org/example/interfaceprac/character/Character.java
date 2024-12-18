package org.example.interfaceprac.character;

public abstract class Character {
    protected int level;
    protected int health;
    protected int maxHealth;

    public Character() {
        this.level = 1;
    }

    public abstract void attack();

    public abstract void attack(Character target);

    public abstract void takeDamage(int amount);

    public abstract void levelUp();

    public void showInfo() {
        System.out.println("level: " + level);
        System.out.println("hp: " + health);
    }
}
