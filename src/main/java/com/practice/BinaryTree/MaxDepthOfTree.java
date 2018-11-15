package com.practice.BinaryTree;

public class MaxDepthOfTree {


    public static class tree {
        Node root;

        tree() {
            root = null;
        }

        public  int MaxDepth(Node node) {
            if (node == null) {
                return 0;
            }

            int ldepth = MaxDepth(node.left);
            int rdepth = MaxDepth(node.right);

            if (ldepth > rdepth)
                return ldepth = ldepth + 1;
            else
                return rdepth = rdepth + 1;

        }

    }

    public static void main(String[] args) {


        tree t = new tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        int depth = t.MaxDepth(t.root);
        System.out.println(depth);
    }
}
