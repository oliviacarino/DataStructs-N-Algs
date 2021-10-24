// simple driver program for a binary tree
// note that this is NOT a binary search tree


public class Driver {

    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();

        /*create root*/
        tree.root = new Node(1);

        /* following is the tree after above statement

             1
           /   \
         null  null     */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        /* 2 and 3 become left and right children of 1
              1
           /     \
          2        3
        /   \     /  \
      null null null null  */


        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                   1
               /       \
              2          3
            /   \       /  \
           4    null  null  null
         /   \
       null null
        */

        System.out.println("tree in order: ");
        tree.inorder(root);

    } // main

} // Driver
