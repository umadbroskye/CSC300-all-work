package com.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 5243, 61, 64135, 684, 124, 1, 1, 5562, 1235, 6751, 78692};
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();
        ShellSort shell = new ShellSort();

        int[] bubbleArray = arr;
        int[] selectionArray = arr;
        int[] insertionArray = arr;
        int[] shellArray = arr;

        long startTime = System.nanoTime();
        bubble.sort(bubbleArray);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(bubbleArray) + "" + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        selection.sort(selectionArray);
        endTime = System.nanoTime();
        System.out.println(Arrays.toString(selectionArray) + "" + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        insertion.sort(insertionArray);
        endTime = System.nanoTime();
        System.out.println(Arrays.toString(insertionArray) + "" + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        shell.sort(shellArray);
        endTime = System.nanoTime();
        System.out.println(Arrays.toString(shellArray) + "" + (endTime - startTime) + "ns");

    }
}
