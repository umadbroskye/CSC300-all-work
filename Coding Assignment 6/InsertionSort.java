package com.example;

public class InsertionSort {
    void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int a = arr[i];
            int b = i - 1;
            while(b >= 0 && arr[b] > a) {
                arr[b+1] = arr[b];
                b-=1;
            }
            arr[b+1] = a;
        }
    }
}
