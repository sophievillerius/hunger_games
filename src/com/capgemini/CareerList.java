package com.capgemini;

import java.util.ArrayList;

public class CareerList {

    // hier wordt beschreven hoe een lijst met 6 (kwart van totaal 24) careercontestants wordt aangemaakt en geprint naar de console
    public ArrayList<CareerContestant> makeCareerContestants() {
        ArrayList<CareerContestant> careerContestantList= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            careerContestantList.add(new CareerContestant());
        }
        int index = 18;
        for (CareerContestant x : careerContestantList) {
            //maak de eerste 3 contestants (= de helft) woman
            if (index <= 20) {
                x.setWoman(true);
                index++;
            }
            else {
                x.setWoman(false);
                index++;
            }
            //set isAlive en HealthLevel op standaardwaarden (true en 100)
            x.setAlive(true);
            x.setHealthLevel(100);
            //set attack level op een random integer tussen 1 en 100, met bonus van 25
            x.setAttackLevel((int)(Math.random() * ((100 - 1) + 1)) + 1 + 25);
            //set defense level op een random integer tussen 1 en 100
            x.setDefenseLevel((int)(Math.random() * ((100 - 1) + 1)) + 1);
            //set Special Item op true (feature van de careers)
            x.setSpecialItem(true);
            System.out.println("Player " + index + " is " + x.printAlive() + ", has a Health level of " +
                    x.getHealthLevel() + ", has an Attack level of " + x.getAttackLevel() + ", has " +
                    "a Defense level of " + x.getDefenseLevel() + ", is a " + x.getGender() + " and " + x.printSpecialItem());
        }
        System.out.println("These are the " + careerContestantList.size() + " Careers.");
        return careerContestantList;
    }
}
