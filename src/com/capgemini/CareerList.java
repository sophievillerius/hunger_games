package com.capgemini;

import java.util.ArrayList;

public class CareerList {

    public ArrayList<CareerContestant> makeCareerContestants() {
        ArrayList<CareerContestant> careerContestantList= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            careerContestantList.add(new CareerContestant());
        }
        System.out.println("There are " + careerContestantList.size() + " Careers.\nThese are their properties:\n" + careerContestantList);
        return careerContestantList;
    }
}
