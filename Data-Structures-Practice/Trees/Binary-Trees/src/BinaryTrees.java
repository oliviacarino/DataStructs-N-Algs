// a simple implementation of a binary tree

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    // Root of Binary Tree
    public Node root;
    public Node temp;

    // Constructors
    BinaryTrees(int key) {
        root = new Node(key);
    } // BinaryTrees

    BinaryTrees() {
        root = null;
    } // BinaryTrees

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) {
        if (temp == null) {
                return;
        } // if
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    } //inorder

    /*function to insert element in binary tree */
    static void insert(Node temp, int key) {
        if (temp == null) {
            root = new Node(key);
            return;
        } // if
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            } // if
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            } // if
        } // while
    } // insert

} // BinaryTrees
