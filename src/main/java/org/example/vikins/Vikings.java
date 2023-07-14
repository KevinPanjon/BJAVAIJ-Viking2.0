package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;
    public int damage;
    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }
    public int attack(int damage) {
        return this.damage = damage;
    }
    public String getMsg() {
        return this.name + "has received " + 50 + " points of damage";
    }
    public String getMsge() {
        return this.name + "has died in combat";
    }

    public String battleCry() {
        return "Odin Owns You All!";
    }
}
