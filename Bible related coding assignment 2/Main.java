package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long totalDisciples = 0;
        ArrayList<Disciple> disciplesList = new ArrayList<Disciple>() {};
        Disciple original = new Disciple((short) 18, 13, false);
        disciplesList.add(original);

        trainDisciples(disciplesList, totalDisciples);

    }


    public static void trainDisciples(ArrayList<Disciple> disciplesList, long totalDisciples){
        int totalYears = 0;
        while(totalDisciples < 7700000000L) {
            for (int i = 0; i < disciplesList.size(); i++) {
                totalDisciples += disciplesList.get(i).advanceTime(disciplesList, totalDisciples);
            }
            totalYears += 3;
        }
        System.out.println(totalDisciples + " " + totalYears);

    }

}
