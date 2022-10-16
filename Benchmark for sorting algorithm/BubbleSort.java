package com.example;

import java.util.List;

public class BubbleSort extends Sorts {

    void sort(List<Integer> list) {
        int len = list.size() - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    swap(list, j, j + 1);
                }
            }
        }
    }
}