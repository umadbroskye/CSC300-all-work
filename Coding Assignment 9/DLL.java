package com.example;

public class DLL {

    static class Node {
        int payloadData;
        Node previous;
        Node next;
        Node(int payloadData)
        {
            this.payloadData = payloadData;
            this.next = null;
            this.previous = null;
        }
    }
    Node head = null;
    Node lastNode(Node node){
        while(node.next!=null)
            node = node.next;
        return node;
    }
    public void quickSort(Node node)
    {
        Node head = lastNode(node);
        QuickSort(node,head);
    }
    Node partition(Node l,Node h)
    {
        int x = h.payloadData;

        Node i = l.previous;

        for(Node j=l; j!=h; j=j.next)
        {
            if(j.payloadData <= x)
            {
                i = (i==null) ? l : i.next;
                int temp = i.payloadData;
                i.payloadData = j.payloadData;
                j.payloadData = temp;
            }
        }
        i = (i==null) ? l : i.next;
        int temp = i.payloadData;
        i.payloadData = h.payloadData;
        h.payloadData = temp;
        return i;
    }
    void QuickSort(Node left, Node right)
    {
        if(right!=null && left!=right && left!=right.next)
        {
            Node p = partition(left,right);
            QuickSort(left,p.previous);
            QuickSort(p.next,right);
        }
    }
    public void displayNodes() {
        Node current = head;
        System.out.println("nodes are: ");
        while (current != null) {
            System.out.print(current.payloadData + " ");
            current = current.next;
        }
        System.out.println();
    }
    void addNode(int new_Data)
    {
        Node new_Node = new Node(new_Data);

        if(head==null){
            head = new_Node;
            return;
        }
        new_Node.next = head;
        head.previous = new_Node;
        new_Node.previous = null;
        head = new_Node;
    }
}
