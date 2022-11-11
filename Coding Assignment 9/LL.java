package com.example;

public class LL {

    static class Node {
        int payloadData;
        Node next;
        Node(int payloadData)
        {
            this.payloadData = payloadData;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void addNode(int data)
    {

        Node newNode = new Node(data);

        if (head == null) head = newNode;
        else tail.next = newNode;
        tail = newNode;
    }

    void sortList()
    {
        Node current = head;
        Node index;
        int temp;
        if (head != null) {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.payloadData > index.payloadData) {
                        temp = current.payloadData;
                        current.payloadData = index.payloadData;
                        index.payloadData = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    void displayNodes()
    {
        Node current = head;
        System.out.print("nodes are: ");
        while (current != null) {
            System.out.print(current.payloadData + " ");
            current = current.next;
        }
        System.out.println();
    }
}
