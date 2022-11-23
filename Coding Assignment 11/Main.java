package com.example;

public class Main {

    public static void main(String[] args) {
	    StackMin stack = new StackMin();
        stack.Push(2);
        System.out.println(stack.Min());
        stack.Push(4);
        stack.Push(1);
        System.out.println(stack.Min());
        stack.Pop();
        System.out.println(stack.Min());
    }
}
