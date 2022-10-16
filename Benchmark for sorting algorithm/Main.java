package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();
        ShellSort shell = new ShellSort();
        QuickSort quick = new QuickSort();

        LCG lcg = new LCG(System.currentTimeMillis());
        List<Integer> list = new ArrayList<>();
        while (list.size() < 10000) {
            list.add(lcg.nextInt(2147483647));
        }
        System.out.println("Element 0 is: " + list.get(0) + ", Element 100 is: " + list.get(100) + ", Element 9999 is: " + list.get(9999));
        System.out.println("Sorting...");
        bubble.doWork(list);
        selection.doWork(list);
        insertion.doWork(list);
        shell.doWork(list);
        quick.doWork(list);

        System.out.println("...Finished Sorting!");
        boolean a = bubble.getSortList().equals(selection.getSortList()) && bubble.getSortList().equals(insertion.getSortList()) && bubble.getSortList().equals(shell.getSortList()) && bubble.getSortList().equals(quick.getSortList());
        String result = a ? "The sorting was SUCCESSFUL, all lists are sorted and equal." : "The sorting was UNSUCCESSFUL, one or more list(s) are not equal.";
        System.out.println(result);
    }
}
