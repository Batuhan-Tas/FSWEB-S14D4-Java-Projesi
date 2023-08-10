package com.workintech.abstraction.model;

public class Vampire extends Monster {
    public Vampire(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return 0;
    }

    @Override
    public double attack() {
        double damageGiven = getDamage() + bleed() + poison();
        System.out.println("Vampire Damage Given: " + damageGiven);
        return damageGiven;
    }
}
