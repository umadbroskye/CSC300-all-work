package com.example;

import java.util.List;

public class SelectionSort extends Sorts {

    void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            swap(list, min, i);
        }
    }
}