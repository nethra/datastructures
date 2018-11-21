package com.practice.Miscellaneous;


import java.util.HashMap;

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        prev = null;
        next = null;

    }
}

public class LRUCache {
    Node head;
    Node end;

    HashMap<Integer, Node> hashMap = new HashMap<Integer, Node>();

    public void set(int key, int value) {

    }

    public int get(int key) {

        if (hashMap.containsKey(key))

        {
            Node n = hashMap.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }

        return -1;
    }

    public void remove(Node n) {



    }

    public void setHead(Node n) {





    }
}

