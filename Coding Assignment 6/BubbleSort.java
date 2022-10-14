package com.example;

public class BubbleSort {

    void sort(int[] arr) {
        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
}
