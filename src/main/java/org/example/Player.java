package org.example;

import java.io.Serializable;

public class Player implements Serializable {

    private final String name;
    private double health;
    private Weapon currentWeapon;
    private Helmet helmet;
    private Shirt shirt;
    private Trouser trouser;
    private Shoe shoe;
    private static final long serialVersionUID = 1L;

    public Player(String name) {
        this.name = name;
        this.health =100;
        this.currentWeapon = new Weapon("Bite", 3);

    }

    public void takeDamage(double enemyAtack){
        double damage = enemyAtack - (getDefenceRating()/0.5);
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("You lose");
            System.exit(1);
        } else {
            System.out.println("You health is: " + this.health);
        }
    }

    public void heal(double healToAdd){
        this.health += healToAdd;
        if(this.health >= 100){
            this.health = 100;
        }
    }

    public String getName() {
        return name;
    }

    public  String getCurrentWeapon(){
        return "Current weapon: "+ currentWeapon.getName()+
                " with:"+ currentWeapon.getDamage()+ " damage";
    }

    public double getHealth() {
        return health;
    }

    private int getDefenceRating() {
        return helmet.getDefenseRating()+
                shirt.getDefenseRating()+
                trouser.getDefenseRating()+
                shoe.getDefenseRating();
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Trouser getTrouser() {
        return trouser;
    }

    public void setTrouser(Trouser trouser) {
        this.trouser = trouser;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    @Override
    public String toString() {
        return "\nCurrent Player: \n" +
                "Name: " + name + "\n" +
                "Health: " + getHealth() + "\n" +
                getCurrentWeapon() +
                "Equipped Armour: " + "\n" +
                "   Helmet: " + helmet +
                "   Shirt: " + shirt +
                "   Trousers: " + trouser +
                "   Shoes: " + shoe;
    }
}
