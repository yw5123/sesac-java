package org.example.compositionprac;

public abstract class Weapon implements Attackable {
    int ATK;
    int durability;

    public Weapon(int ATK) {
        this.ATK = ATK;
        this.durability = 100;
    }

    @Override
    public void attack() {
        System.out.println("weapon attack! - " + ATK);
    }

    public abstract void specialAttack();
}
