// simple implementation of BFS -- on a Binary Tree

import java.util.*;

class BFSTree {

    Node root;

    private BFSTree createBinaryTree() {
        BFSTree bt = new BFSTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    } // BFSTree

    public static void BFSPrint(Node start) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> seen = new HashSet<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (!seen.contains(curr)) {
                seen.add(curr);
                System.out.println(curr);
            } // if
//            for (Node adjacent : curr.adjacents) {
            for (Node adjacent :
                if (!seen.contains(adjacent)) {
                    queue.add(adjacent);
                } // if
            } // for

        } // while

    } // BFSPrint

    // add Nodes to tree -- recursive implementation
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        } // if

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        } // if

        return current;
    } // addRecursive

    // calls addRecursive()
    public void add(int value) {
        root = addRecursive(root, value);
    } // add


    public static void main(String[] args) {
        BFSTree bt = new BFSTree();
        bt = bt.createBinaryTree();
    } // main

} // BFSTree
