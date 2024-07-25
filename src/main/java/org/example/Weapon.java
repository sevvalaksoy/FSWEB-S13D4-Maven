package org.example;

public enum Weapon {
    SWORD(5,3.0),
    ARBALETE(5,7.0),
    GUN(10,9.0);

    private final int damage;
    private final double attackSpeed;

    Weapon (int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage (){
        return damage;
    }
    public double getAttackSpeed (){
        return attackSpeed;
    }
}
