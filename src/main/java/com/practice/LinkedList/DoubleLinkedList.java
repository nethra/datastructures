package com.practice.LinkedList;

public class DoubleLinkedList {

    static Node head;

    static class Node {
        int val;
        Node prev;
        Node next;

        Node(int v) {
            val = v;
        }
    }

    static void InsertAtFront(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    static void InsertAtEnd(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        Node n = last.next;
        last.next = new Node(val);
        last.prev = n;

    }

    static void InsertAfter(Node prevNode, int val) {
        if (prevNode == null) {
            System.out.println("Previous Node cannot be null");
            return;
        }
        Node n = new Node(val);
        n.next = prevNode.next;
        prevNode.next = n;

    }

    static void PrintList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        head = new Node(1);
        list.InsertAtEnd(2);
        list.InsertAtEnd(3);
        list.InsertAtEnd(4);
        list.InsertAtFront(5);
        list.InsertAtFront(6);
        list.InsertAtFront(7);
        list.InsertAfter(head.next.next, 8);
        PrintList();
    }
}
