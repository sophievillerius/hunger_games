package com.capgemini;

// Dit is een speciale contestant die een bonus heeft op Attack Level en een speciaal item om mee te beginnen
public class CareerContestant extends Contestant {

    boolean specialItem = true;

    CareerContestant() {
        super(true, 100, 25, 30, false, true);
    }
}
