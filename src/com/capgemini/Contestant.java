package com.capgemini;

// Dit is de basis class voor contestants
public class Contestant {

    private boolean alive;
    private int healthLevel;
    private int defenseLevel;
    private int attackLevel;
    private boolean isWoman;

    public Contestant(boolean alive, int healthLevel, int defenseLevel, int attackLevel, boolean isWoman) {
        this.alive = alive;
        this.healthLevel = healthLevel;
        this.defenseLevel = defenseLevel;
        this.attackLevel = attackLevel;
        this.isWoman = isWoman;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }

    public String getGender() {
        if (isWoman) {
           return "woman";
        } else {
            return "man";
        }
    }

}
