package com.capgemini;

public class Contestant {

    private boolean alive;
    private int healthLevel;
    private int defenseLevel;
    private int attackLevel;

    public Contestant(boolean alive, int healthLevel, int defenseLevel, int attackLevel) {
        this.alive = alive;
        this.healthLevel = healthLevel;
        this.defenseLevel = defenseLevel;
        this.attackLevel = attackLevel;
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
}
