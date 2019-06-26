package com.jeonguk.algorithm.tree;

public class BinarySearchTreeMain {

    private Node root = new Node();

    public Node insertKey(final Node root, int x) {
        Node newNode = new Node(x);
        if (root == null) {
            return newNode;
        } else if (root.data > newNode.data) {
            root.left = insertKey(root.left, x);
            return root;
        } else if (root.data < newNode.data) {
            root.right = insertKey(root.right, x);
            return root;
        } else {
            return root;
        }
    }

    public void insertBST(int x) {
        root = insertKey(root, x);
    }

    public Node searchBST(int x) {
        while (root != null) {
            if (x < root.data) {
                root = root.left;
            } else if (x > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println("root.data " + root.data + " ");
            inOrder(root.right);
        }
    }

    public void printBST() {
        inOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchTreeMain bst = new BinarySearchTreeMain();

        bst.insertBST(10);
        bst.insertBST(15);
        bst.insertBST(6);
        bst.insertBST(7);
        bst.insertBST(22);
        bst.insertBST(13);
        bst.insertBST(3);
        bst.insertBST(5);
        bst.insertBST(16);
        bst.insertBST(1);
        bst.insertBST(17);
        System.out.println("Binary Tree >>>");
        bst.printBST();

        System.out.println("Is There 13 ? >>> ");

        Node p1 = bst.searchBST(13);
        if (p1 != null) {
            System.out.println(p1.data + " 탐색 성공");
        } else {
            System.out.println("탐색 실패");
        }
    }

}

class Node {

    int data;
    Node left;
    Node right;

    public Node() {
        this.left = null;
        this.right = null;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

}