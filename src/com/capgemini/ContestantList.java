package com.capgemini;

import java.util.ArrayList;

public class ContestantList extends ArrayList<Contestant> {



    public ContestantList(){
    }

    public int getNumberOfContestantsAlive() {
        int numberAlive = 0;
        for (Contestant i: this) {
            if (i.isAlive()) {
                numberAlive+=1;
            }
        }
        return numberAlive;
    }

    public int getContestantAlive() {
        int index = 1;
        for (Contestant i : this) {
            if (i.isAlive()) {
                index += indexOf(i);
            }
        }
        return index;
    }

    public void restoreHealthRemainingContestants() {
        for (Contestant i : this) {
            if (i.isAlive()) {
                i.restoreHealth();
            }
        }
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

        System.out.println("\nA new day");

        int chanceOfFighting = ((int)(Math.random() * ((100 - 1) + 1)) + 1);
        //these numbers should not be the same
        int fighter1 = ((int)(Math.random() * ((23) + 1)));
        //check if this contestant is still alive
        while (!this.get(fighter1).isAlive()) {
            fighter1 = ((int)(Math.random() * ((23) + 1)));
        }
        int fighter2 = ((int)(Math.random() * ((23) + 1)));
        //make sure you don't generate the same fighter and make sure he/she is alive
        while (fighter1 == fighter2 || !this.get(fighter2).isAlive()) {
            fighter2 = ((int)(Math.random() * ((23) + 1)));
        }

//        System.out.println(chanceOfFighting);
//        System.out.println(fighter1);
//        System.out.println(fighter2);
        if (chanceOfFighting <= 75) {
            System.out.println("\nContestant " + (fighter1 + 1) + " and Contestant " + (fighter2 + 1) + " are going to fight.\n" +
                    "Contestant " + (fighter1 + 1) + " has an Attack of " + this.get(fighter1).getAttackLevel() + " and" +
                    " a Defense of " + this.get(fighter1).getDefenseLevel() + ".\n" +
                    "Contestant " + (fighter2 + 1) + " has an Attack of " + this.get(fighter2).getAttackLevel() + " and" +
                    " a Defense of " + this.get(fighter2).getDefenseLevel() + ".");
            //make sure to stop when one of the contestants dies
            while (this.get(fighter1).isAlive() && this.get(fighter2).isAlive()) {
                if (Math.random() < 0.5) {
                    contestantFightStart(fighter1, fighter2);
                } else {
                    contestantFightStart(fighter2, fighter1);
                }
            }
        }

        else {
            System.out.println("No fight today");
        }

    }

    public void contestantFightStart(int cont1, int cont2){
        System.out.println("Contestant " + (cont1 + 1) + " can start the attack.");
//        int HL1 = this.get(cont1).getHealthLevel();
//        int HL2 = this.get(cont2).getHealthLevel();
        if (this.get(cont1).getAttackLevel() > this.get(cont2).getDefenseLevel()) {
            int healthDecrease = (this.get(cont1).getAttackLevel() - this.get(cont2).getDefenseLevel());
            this.get(cont2).decreaseHealth(healthDecrease);
            System.out.println("Contestant " + (cont2 + 1) + " loses the attack, and the Health level decreases to " +
                    this.get(cont2).getHealthLevel());
            if (this.get(cont2).getHealthLevel() <= 0 ) {
                this.get(cont2).setAlive(false);
                System.out.println("Contestant " + (cont2 + 1) + " dies.");
            }
        }
        else if (this.get(cont2).getDefenseLevel() > this.get(cont1).getAttackLevel()) {
            int healthDecrease = (this.get(cont2).getDefenseLevel() - this.get(cont1).getAttackLevel());
            this.get(cont1).decreaseHealth(healthDecrease);
            System.out.println("Contestant " + (cont1 + 1) + " loses the attack, and the Health level decreases to " +
                    this.get(cont1).getHealthLevel());
            if (this.get(cont1).getHealthLevel() <= 0 ) {
                this.get(cont1).setAlive(false);
                System.out.println("Contestant " + (cont1 + 1) + " dies.");
            }

        }
        else {
            System.out.println("The contestants are equal");
        }

    }

}

