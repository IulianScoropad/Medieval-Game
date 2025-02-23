package org.example;

import java.io.Serializable;

public class Armour implements Serializable {

    private final String name;
    private  int durability;
    private  int  defenseRating;
    private static final long serialVersionUID = 1L;

    public Armour(String name, int durability, int defenseRating) {
        this.name = name;
        this.durability = durability;
        this.defenseRating = defenseRating;
    }

    public void reduceDurability(int reduction) {
        durability -= reduction;
        if(durability < 0) {
            System.out.println("Armour durability is negative, please sold for scraps");
            defenseRating = 0;
        }
    }

    public void repareArmour(int amount) {
        durability += amount;
        if(durability > 100) {
            durability = 100;
        }
    }

    public int getDefenseRating() {
        return (int)(defenseRating*(durability/100));
    }

    @Override
    public String toString() {
        return name + "Defense Rating:"+ defenseRating +"\n";
    }
}
