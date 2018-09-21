package com.capgemini;

// Dit is een speciale contestant die een bonus heeft op Attack Level en een speciaal item om mee te beginnen
public class CareerContestant extends Contestant {

    private String contestantType = "career contestant";

    //change the constructor as in DistrictContestant

    CareerContestant(int healthLevel, int defenseLevel, int attackLevel, boolean specialItem) {
        super (healthLevel, defenseLevel, (attackLevel+25), specialItem);
    }

    public String getContestantType() {
        return contestantType;
    }

    public void setContestantType(String contestantType) {
        this.contestantType = contestantType;
    }
}
