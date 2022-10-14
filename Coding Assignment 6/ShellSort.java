package com.example;

public class ShellSort {
    void sort(int[] arr) {
        for(int g = arr.length / 2; g > 0; g /= 2) {
            for(int i = g; i < arr.length; i ++) {
                int a = arr[i];
                for(int j = i; j >= g && arr[j - g] > a; j-=g) {
                    arr[j] = arr[j - g];
                }
            }
        }
    }
}
