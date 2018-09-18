package com.capgemini;

public class ArenaView {

    public static void main(String[] args) {
//        String arena = makeArena();
        Contestant contestant1 = new Contestant(true, 100, 75, 50);
        System.out.println("Contestant 1 is alive, has a Health Level of " + contestant1.getHealthLevel() + ", a Defense Level of " + contestant1.getDefenseLevel() + " and an Attack Level of " + contestant1.getAttackLevel() + ".");

    }
}
