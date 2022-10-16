package com.example;

import java.util.List;

public class QuickSort extends Sorts {

    int partition(List<Integer> list, int l, int h) {
        int pivot = list.get(h);
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (list.get(j) < pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, h);
        return i + 1;
    }

    void sort(List<Integer> list, int l, int h) {
        if (l < h) {
            int part = partition(list, l, h);

            sort(list, l, part - 1);
            sort(list, part + 1, h);
        }
    }

    @Override
    void doWork(List<Integer> list) {
        sortList.addAll(list);
        long startTime = System.currentTimeMillis();
        sort(sortList, 0, list.size() - 1);
        long endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        printStuff();
    }

}