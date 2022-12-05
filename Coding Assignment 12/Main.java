package com.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable(100);
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int key = rand.nextInt(1000000);
            table.insert(key);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            int key = rand.nextInt(1000000);
            table.search(key);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time to search 100 items: " + duration + " nanoseconds");

        System.out.println("Size of table: " + table.getSize());
        System.out.println("Number of items in table: " + table.getNumItems());
    }

}