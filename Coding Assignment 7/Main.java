package com.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.currentTimeMillis;


public class Main {

    public static void main(String[] args) {
        LCG lcg = new LCG(currentTimeMillis());
        MergeSort ms = new MergeSort();
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lcg.nextInt(2147483647);
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        long start = currentTimeMillis();
        ms.sort(arr, 0, arr.length - 1);
        long end = currentTimeMillis();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(end - start + "ms");

    }
}
