package org.example.compositionprac;

public class Character implements Attackable {
    int HP;
    int ATK;
    Weapon weapon;

    public Character(int HP, int ATK) {
        this.HP = HP;
        this.ATK = ATK;
    }

    public Character(int HP, int ATK, Weapon weapon) {
        this.HP = HP;
        this.ATK = ATK;
        this.weapon = weapon;
    }

    public void setWeapon() {
        this.weapon = null;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("attack! - " + ATK);
        if (weapon != null) {
            weapon.attack();
            weapon.specialAttack();
        }
    }
}
