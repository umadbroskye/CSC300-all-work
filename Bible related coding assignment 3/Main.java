package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        long disciple = 13L;
        int years = 0;

        while(disciple <= 2300000000L)
        {
            disciple = rand.nextInt(25)!=0 ? disciple - rand.nextInt(12000) : disciple * 3;
            years += 3;

        }
        System.out.println(years + " years for 2.3bn people");
    }
}
