package com.example;

import java.util.ArrayList;

public class Disciple {
    private static final short lifespan = 72;
    private static final short babyAge = 30;
    private static final short trainAge = 18;

    public static short age;
    public static long disciples;
    public static long couples;
    public static boolean hasChild;

    public Disciple(short age, long disciples, boolean hasChild) {
        Disciple.age = age;
        Disciple.disciples = disciples;
        Disciple.couples = Disciple.disciples / 2;
        Disciple.hasChild = hasChild;
    }

    public long advanceTime(ArrayList<Disciple> disciplesList, long totalDisciples) {
        age += 3;
        if (age >= trainAge) {
            if (age >= lifespan) {
                disciplesList.remove(this);
                return 0;
            }
            if (age >= babyAge && !hasChild) {
                hasChild = true;
                Disciple baby = giveBirth();
                disciplesList.add(baby);
                totalDisciples += disciples;
            }
            totalDisciples += disciples * 3;
            return totalDisciples;
        }
        return 0;
    }

    private Disciple giveBirth() {
        return new Disciple((short) 0, (couples / 2), false);
    }


}
