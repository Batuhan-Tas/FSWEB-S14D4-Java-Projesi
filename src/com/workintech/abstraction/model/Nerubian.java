package com.workintech.abstraction.model;

public class Nerubian extends Monster{
    public Nerubian(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return 0;
    }


    @Override
    public double poison() {
        return getDamage()*0.30;
    }

    @Override
    public double attack() {
        double damageGiven = getDamage() + bleed() + poison();
        System.out.println("Nerubian Damage Given: " + damageGiven);
        return damageGiven;

    }
}
