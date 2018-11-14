package com.practice.LinkedList;

import java.awt.*;

public class SingleLinkedList {

    static Node head;

    static class Node {
        int val;

        Node next;

        Node(int v) {
            val = v;
            next = null;
        }
    }

    public static void InsertAtFront(int val) {
        Node n = head;
        head = new Node(val);
        head.next = n;
    }

    public static void InsertAtEnd(int val) {

        if (head == null) {
            head = new Node(val);
            return;
        }
        Node last = head;
        while (last.next != null) {

            last = last.next;
        }

        last.next = new Node(val);
    }

    public static void InsertAfter(Node prevNode, int val) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node n = new Node(val);
        n.next = prevNode.next;
        prevNode.next = n;
    }

    public static void deleteAtEnd()
    {
        Node lastBeforeNode = null;
        Node n = head;

        while(n.next.next !=null)
        {
            lastBeforeNode = n;
            n=n.next;
        }
        lastBeforeNode.next =null;

    }

    public static void deleteAtFront()
    {

        Node n = head;
        head=n.next;

    }

    public static void deleteNode(Node node)
    {

        if (node == null) {
            System.out.println("The given  node cannot be null");
            return;
        }

       Node n = head;
       while(n.next!=node)
       {
           n = n.next;
       }
       n.next=n.next.next;


    }
    public static void PrintList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.head = new Node(1);
        s.InsertAtFront(2);
        s.InsertAtFront(3);
        s.InsertAtEnd(4);
        s.InsertAtEnd(5);
        s.InsertAfter(head.next.next,6);
        s.deleteNode(head.next.next);
        s.deleteAtEnd();
        s.deleteAtFront();
        PrintList();

    }
}
