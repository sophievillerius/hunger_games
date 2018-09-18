package com.capgemini;

public class ArenaController {

    public void makeArena()     {
        // hier wordt een contestant aangemaakt en zijn eigenschappen naar de console geprint
        Contestant contestant1 = new Contestant(true, 100, 75, 50, true);
        System.out.println("Contestant 1 is alive, is a " + contestant1.getGender() + ", has a Health Level of " + contestant1.getHealthLevel() + ", a " +
        "Defense Level of " + contestant1.getDefenseLevel() + " and an Attack Level of " +
                contestant1.getAttackLevel() + ".");

    }

}
