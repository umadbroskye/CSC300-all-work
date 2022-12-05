package com.example;

import java.util.LinkedList;

public class HashTable {

    private int size;
    private int numItems;
    private LinkedList<Integer>[] table;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<Integer>();
        }
    }

    public void insert(int key) {
        int index = hash(key);
        table[index].add(key);
        numItems++;
    }

    public void search(int key) {
        int index = hash(key);
    }

    public int hash(int key) {
        return key % size;
    }

    public int getSize() {
        return size;
    }

    public int getNumItems() {
        return numItems;
    }

}