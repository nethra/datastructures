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
    int maxCapacity;
    Node head;
    Node end;

    HashMap<Integer, Node> hashMap = new HashMap<Integer, Node>();

    public void set(int key, int value) {

        if (hashMap.containsKey(key)) {
            Node old = hashMap.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        } else {
            Node created = new Node(key, value);

            if (hashMap.size() > maxCapacity) {
                hashMap.remove(end.key);
                remove(end);
                setHead(created);

            } else {
                setHead(created);
            }
            hashMap.put(key, created);

        }

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

        if (n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }

        if (n.next != null) {
            n.next.prev = n.prev;

        } else {
            end = n.prev;
        }


    }

    public void setHead(Node n) {

        n.next = head;
        n.prev = null;

        if (head != null) {
            head.prev = n;
        }
        head = n;

        if (end == null) {
            end = head;
        }
    }
}

