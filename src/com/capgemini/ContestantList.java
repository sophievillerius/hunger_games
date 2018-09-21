package com.capgemini;

import java.util.ArrayList;

public class ContestantList extends ArrayList<Contestant> {



    public ContestantList(){
    }

    //separate make method from constructor, and make it void
    public void makeContestants() {

        for (int i = 0; i < 18; i++) {
            this.add(new DistrictContestant(100, ((int)(Math.random() * ((100 - 1) + 1)) + 1),
                    ((int)(Math.random() * ((100 - 1) + 1)) + 1), false));
        }
        for (int i = 0; i < 6; i++) {
            this.add(new CareerContestant(100, ((int)(Math.random() * ((100 - 1) + 1)) + 1),
                    ((int)(Math.random() * ((100 - 1) + 1)) + 1), true));
        }
        int index = 0;
        for (Contestant x : this) {
            //maak de eerste 9 contestants (= de helft) woman
            if (index < 9) {
                x.setWoman(true);
                index++;
            }
            else if (index < 18){
                x.setWoman(false);
                index++;
            }
            else if (index < 21) {
                x.setWoman(true);
                index++;
            }
            else {
                x.setWoman(false);
                index++;
            }


            System.out.println("Contestant " + index + " is a " + x.getContestantType() + ", is " + x.printAlive() + ", has a Health level of " +
                    x.getHealthLevel() + ", has an Attack level of " + x.getAttackLevel() + ", has " +
                    "a Defense level of " + x.getDefenseLevel() + ", is a " + x.getGender() + " and " + x.printSpecialItem());
        }
        System.out.println("These are the " + this.size() + " Contestants.");
    }

    //method to make contestants fights
    public void contestantFight() {

        int chanceOfFighting = ((int)(Math.random() * ((100 - 1) + 1)) + 1);
        /*these numbers should not be the same*/
        int fighter1 = ((int)(Math.random() * ((23 - 0) + 1)));
        int fighter2 = ((int)(Math.random() * ((23 - 0) + 1)));
        //make sure you don't generate the same fighter
        while (fighter1 == fighter2) {
            fighter2 = ((int)(Math.random() * ((23 - 0) + 1)));
        }
//        System.out.println(chanceOfFighting);
//        System.out.println(fighter1);
//        System.out.println(fighter2);
        if (chanceOfFighting <= 75) {
            System.out.println("Contestant " + (fighter1 + 1) + " and Contestant " + (fighter2 + 1) + " are going to fight.\n" +
                    "Contestant " + (fighter1 + 1) + " has an Attack of " + this.get(fighter1).getAttackLevel() + " and" +
                " a Defense of " + this.get(fighter1).getDefenseLevel() + ".\n" +
                    "Contestant " + (fighter2 + 1) + " has an Attack of " + this.get(fighter2).getAttackLevel() + " and" +
                    " a Defense of " + this.get(fighter2).getDefenseLevel() + ".");
        }
        //add: make coin toss about who can start the attack
        if (this.get(fighter1).getAttackLevel() > this.get(fighter2).getDefenseLevel()) {
            System.out.println("Contestant " + (fighter2 + 1) + " loses and dies." );
            this.get(fighter2).setAlive(false);
        }
        else if (this.get(fighter2).getAttackLevel() > this.get(fighter1).getDefenseLevel()) {
            System.out.println("Contestant " + (fighter1 + 1) + " loses and dies." );
            this.get(fighter1).setAlive(false);
        }
        else {
            System.out.println("The contestants are equal");
        }
        //add: decrease the health level after every turn, the first one to reach zero is dying
    }
}

