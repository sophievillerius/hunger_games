package com.capgemini;

// Dit is een speciale contestant die een bonus heeft op Defense Level
public class DistrictContestant extends Contestant {

    private String contestantType = "district contestant";

//    //hoe zorg ik ervoor dat deze waarden niet standaard ingevuld worden?
//    DistrictContestant() {
//        super(100, 25, 30, false, false);
//    }

    DistrictContestant(int healthLevel, int defenseLevel, int attackLevel, boolean specialItem){
        super(healthLevel, (defenseLevel + 25), attackLevel, specialItem);
    }

    public String getContestantType() {
        return contestantType;
    }

    public void setContestantType(String contestantType) {
        this.contestantType = contestantType;
    }
}
