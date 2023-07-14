package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public Saxon(int health, int strength) {
        super(health, strength);
    }
    public int attack(int damage){
        return this.damage = damage - 25;
    }

    public String getMsg(){
        return "A Saxon has received " + 45 + " points of damage";
    }
    public String getMsg2(){
        return "A Saxon has died in combat";
    }
}
