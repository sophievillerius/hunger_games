package com.capgemini;

public class ArenaController {

    public void makeArena()     {
//        // hier wordt een test-contestant aangemaakt en zijn eigenschappen naar de console geprint
//        Contestant contestant1 = new Contestant(true, 100, 75, 50, true, false);
//        System.out.println("Contestant 1 is alive, is a " + contestant1.getGender() + ", has a Health Level of " + contestant1.getHealthLevel() + ", a " +
//        "Defense Level of " + contestant1.getDefenseLevel() + " and an Attack Level of " +
//                contestant1.getAttackLevel() + ".");

//        //het aanmaken van de lijst met districtcontestants
//        DistrictList districtList1 = new DistrictList();
//        districtList1.makeDistrictContestants();
//
//        //het aanmaken van de lijst met careercontestants
//        CareerList careerList1 = new CareerList();
//        careerList1.makeCareerContestants();

        //        //het aanmaken van de lijst met careercontestants
        ContestantList contestantList1 = new ContestantList();
        contestantList1.makeContestants();

        //battle method for 1 day until 1 survivor!!
        int dayNumber = 1;
        while (contestantList1.getNumberOfContestantsAlive() > 1) {


            System.out.println("\nDay " + dayNumber);

            contestantList1.contestantFight();
            contestantList1.restoreHealthRemainingContestants();

            if (contestantList1.getNumberOfContestantsAlive() > 1) {
                System.out.println("\nThere are now " + contestantList1.getNumberOfContestantsAlive() + " contestants alive.");
            }
            dayNumber+= 1;
        }

        if (contestantList1.getNumberOfContestantsAlive() == 1) {
            System.out.println("\nThere is now only one contestant left. The winner is contestant " + contestantList1.getContestantAlive() + ". This contestant is now killed by President Snow... :(");
        }

    }

}
