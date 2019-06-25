package com.jeonguk.algorithm.tree;

public class TreeOrderTraversalMain {

    public static void main(String[] args) {
        Node data = createData();
        preOrderTraversal(data);
        System.out.println();
        postOrderTraversal(data);
        System.out.println();
        inOrderTraversal(data);
    }

    public static void preOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.value + " ");
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    public static void postOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.println(n.value + " ");
    }

    public static void inOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        inOrderTraversal(n.left);
        System.out.println(n.value + " ");
        inOrderTraversal(n.right);
    }

    /**
     *           a
     *          / \
     *        b    g
     *       / \
     *     c    d
     *    /
     *  e
     *   \
     *    f
     * @return Tree node
     */
    public static Node createData() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;
    }

}

class Node {
    String value;
    Node left;
    Node right;
    public Node(String value) {
        this.value = value;
    }
}