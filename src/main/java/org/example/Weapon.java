package org.example;

import java.io.Serializable;

public class Weapon implements Serializable {

    private final String name;
    private final int damage;
    private static final long serialVersionUID = 1L;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
}
