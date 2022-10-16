package com.example;

import java.util.List;

public class ShellSort extends Sorts {

    void sort(List<Integer> list) {
        for (int g = list.size() / 2; g > 0; g /= 2) {
            for (int i = g; i < list.size(); i++) {
                int a = list.get(i);
                int j;
                for (j = i; j >= g && list.get(j - g) > a; j -= g) {
                    list.set(j, list.get(j - g));
                    swaps++;
                }
                list.set(j, a);
            }
        }
    }
}