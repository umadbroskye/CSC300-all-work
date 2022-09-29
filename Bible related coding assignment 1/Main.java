package com.example;

import static java.lang.Math.floor;

public class Main {

    public static void main(String[] args) {
    long disciples = 13;
    long years = trainDisciples(disciples, 3);
    System.out.println("It took " + years + " years to convert everyone!");

    years = trainDisciples(disciples, 4);
    if(years <= 50)
        System.out.println("It took less than 50 years to convert everyone assuming " + 4 + " disciples were trained at a time!");

    }

    public static long trainDisciples(long disciples, int mult){
        long years = 0;
        while(disciples < 7700000000L) {
            disciples *= mult;
            years += 3;
        }
        return years;
    }
}
