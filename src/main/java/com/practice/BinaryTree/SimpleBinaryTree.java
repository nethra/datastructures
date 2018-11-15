package com.practice.BinaryTree;

class Node {
    int val;

    Node left;
    Node right;

    public Node(int v) {
        val = v;
        left = right = null;
    }


}

public class SimpleBinaryTree {

    Node root;


    public SimpleBinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        SimpleBinaryTree binaryTree = new SimpleBinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);


    }
}
