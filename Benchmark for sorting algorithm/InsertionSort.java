package com.example;

import java.util.List;

public class InsertionSort extends Sorts {

    void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i);
            int b = i - 1;
            while (b >= 0 && list.get(b) > a) {
                list.set(b + 1, list.get(b));
                b -= 1;
                swaps++;
            }
            list.set(b + 1, a);
        }
    }
}