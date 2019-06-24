package com.jeonguk.algorithm.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeMain {

    int height(Node node) {
        if (node == null)
            return 0;
        int h = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node cur = queue.poll();
                if (cur.left != null)
                    queue.offer(cur.left);
                if (cur.right != null)
                    queue.offer(cur.right);
                size--;
            }
            h++;
        }
        return h;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    /**
     * Example:
     * Input:
     * 2
     * 2
     * 1 2 L 1 3 R
     * 4
     * 10 20 L 10 30 R 20 40 L 20 60 R
     *
     * Output:
     * 2
     * 3
     *
     * Explanation:
     * Testcase1: The tree is
     *    1
     *  /  \
     * 3    2
     * So, the height would be 2.
     * Testcase2: The tree is
     *       10
     *      / \
     *    20   30
     *   /  \
     * 40    60
     * So, height would be 3.
     *
     * @param args
     */
    // driver function to test the above functions
    public static void main(String[] args) {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        //Node root=null;
        while (times > 0) {
            HashMap<Integer, Node> nodeMap = new HashMap<>();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = nodeMap.get(n1);
                if (parent == null) {
                    parent = new Node(n1);
                    nodeMap.put(n1, parent);
                    if (root == null) {
                        root = parent;
                    }
                }
                Node child = new Node(n2);
                if (lr == 'L') {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
                nodeMap.put(n2, child);
                n--;
            }
            TreeMain g = new TreeMain();
            System.out.println(g.height(root));
            times--;
        }
    }

}
