package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Sorts {
    protected final List<Integer> sortList = new ArrayList<>();
    protected long swaps = 0;
    protected long timeTaken = 0;

    protected void printStuff() {
        String ele0 = "Element 0 is: " + sortList.get(0);
        String ele100 = ", Element 100 is: " + sortList.get(100);
        String ele300 = ", Element 9999 is: " + sortList.get(9999);

        String printTime = " Time taken: " + timeTaken + "ms.";
        String printSwaps = " Swaps: " + swaps + ".";
        System.out.println(ele0 + ele100 + ele300 + printTime + printSwaps);
    }

    protected List<Integer> getSortList() {
        return sortList;
    }


    void doWork(List<Integer> list) {
        sortList.addAll(list);
        long startTime = System.currentTimeMillis();
        sort(sortList);
        long endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        printStuff();
    }

    void swap(List<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
        swaps++;
    }

    void sort(List<Integer> list) {
    }
}