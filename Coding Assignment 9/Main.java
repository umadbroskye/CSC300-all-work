package com.example;

public class Main {

    public static void main(String[] args)
    {
        DLL myList = new DLL();
        myList.addNode(453);
        myList.addNode(623);
        myList.addNode(3);
        myList.addNode(642128);
        myList.displayNodes();
        myList.quickSort(myList.head);
        myList.displayNodes();
    }
}