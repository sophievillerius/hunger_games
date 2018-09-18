package com.capgemini;

// Dit is de basis class voor contestants
public class Contestant {

    // deze variabelen beschrijven de eigenschappen van de contestant: levend ja/nee, health level (0-100), defense level (random 0-100), attack level (0-100), geslacht (vrouw ja/nee), heeft speciaal voorwerp ja/nee
    private boolean alive;
    private int healthLevel;
    private int defenseLevel;
    private int attackLevel;
    private boolean isWoman;
    private boolean specialItem;

    public Contestant(boolean alive, int healthLevel, int defenseLevel, int attackLevel, boolean isWoman, boolean specialItem) {
        this.alive = alive;
        this.healthLevel = healthLevel;
        this.defenseLevel = defenseLevel;
        this.attackLevel = attackLevel;
        this.isWoman = isWoman;
        this.specialItem = specialItem;
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

    public boolean isSpecialItem() {
        return specialItem;
    }

    public void setSpecialItem(boolean specialItem) {
        this.specialItem = specialItem;
    }

    public String printSpecialItem() {
        if (isSpecialItem()) {
            return "has a special item";
        } else {
            return "has no special item";
        }
    }

    public String printAlive() {
        if (isAlive()) {
            return "alive";
        } else {
            return "dead";
        }
    }
}
