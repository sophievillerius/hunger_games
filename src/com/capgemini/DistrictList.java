package com.capgemini;

import java.util.ArrayList;

public class DistrictList {

//    private DistrictContestant[] districtList;

    public ArrayList<DistrictContestant> makeDistrictContestants() {
        ArrayList<DistrictContestant> districtContestantList= new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            districtContestantList.add(new DistrictContestant());
        }
        System.out.println("There are " + districtContestantList.size() + " District Contestants.\nThese are their properties:\n" + districtContestantList);
        return districtContestantList;
    }
}
