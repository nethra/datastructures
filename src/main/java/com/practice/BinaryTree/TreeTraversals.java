package com.practice.BinaryTree;


public class TreeTraversals {

    Node root;
    TreeTraversals()
    {
        root = null;

    }

    public static void PrintInOrder(Node node)
    {
        if(node ==null)
        {
            return;
        }

        PrintInOrder(node.left);
        System.out.print(node.val + " ");
        PrintInOrder(node.right);
    }

    public static void PrintPostOrder(Node node)
    {
        if(node ==null)
        {
            return;
        }

        PrintPostOrder(node.left);
        PrintPostOrder(node.right);
        System.out.print(node.val + " ");
    }

    public static void PrintPreOrder(Node node)
    {
        if(node ==null)
        {
            return;
        }

        System.out.print(node.val + " ");
        PrintPreOrder(node.left);
        PrintPreOrder(node.right);
    }
    public static void main(String[] args) {
        TreeTraversals t = new TreeTraversals();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(6);
        t.root.right.right = new Node(7);
        PrintInOrder(t.root);
        System.out.println();
        PrintPreOrder(t.root);
        System.out.println();
        PrintPostOrder(t.root);
    }
}
