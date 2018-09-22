//package com.capgemini;
//
//import java.util.ArrayList;
//
//public class DistrictList {
//
//    // hier wordt beschreven hoe een lijst met 18 districtcontestants (driekwart van totaal 24) wordt aangemaakt en geprint naar de console
//    public ArrayList<DistrictContestant> makeDistrictContestants() {
//        ArrayList<DistrictContestant> districtContestantList= new ArrayList<>();
//        for (int i = 0; i < 18; i++) {
//            districtContestantList.add(new DistrictContestant(100, ((int)(Math.random() * ((100 - 1) + 1)) + 1), ((int)(Math.random() * ((100 - 1) + 1)) + 1), true));
//        }
//        int index = 0;
//        for (DistrictContestant x : districtContestantList) {
//            //maak de eerste 9 contestants (= de helft) woman
//            if (index <=9) {
//                x.setWoman(true);
//                index++;
//            }
//            else {
//                x.setWoman(false);
//                index++;
//            }
////            //set isAlive en HealthLevel op standaardwaarden (true en 100)
////            x.setAlive(true);
////            x.setHealthLevel(100);
////            //set attack level op een random integer tussen 1 en 100
////            x.setAttackLevel((int)(Math.random() * ((100 - 1) + 1)) + 1);
////            //set defense level op een random integer tussen 1 en 100, met bonus van 25
////            x.setDefenseLevel((int)(Math.random() * ((100 - 1) + 1)) + 1 + 25);
////            // set special item op false (want district contestants hebben geen special item)
////            x.setSpecialItem(false);
//            System.out.println("Contestant " + index + " is " + x.printAlive() + ", has a Health level of " +
//                    x.getHealthLevel() + ", has an Attack level of " + x.getAttackLevel() + ", has " +
//                    "a Defense level of " + x.getDefenseLevel() + ", is a " + x.getGender() + " and " + x.printSpecialItem());
//        }
//        System.out.println("These are the " + districtContestantList.size() + " District Contestants.");
//        return districtContestantList;
//    }
//}
