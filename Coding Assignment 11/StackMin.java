package com.example;

import java.util.Stack;

public class StackMin {
    Stack<Integer> stack;
    int minInStack;

    StackMin() {
        stack = new Stack<Integer>();
    }

    public void Push(int value) {
        if (stack.isEmpty()) {
            minInStack = value;
            stack.push(value);
            return;
        }

        if (value < minInStack) {
            stack.push(2 * value - minInStack); //needed to keep StackMin O(1)
            minInStack = value;
            return;
        }

        stack.push(value);
        return;
    }

    public void Pop() {
        if (stack.isEmpty()) {
            return;
        }

        int removed = stack.pop();
        if (removed < minInStack) {
            minInStack = 2 * minInStack - removed; //needed to keep StackMin O(1)
        }
        return;
    }

    public int Min() {
        return minInStack;
    }
}
