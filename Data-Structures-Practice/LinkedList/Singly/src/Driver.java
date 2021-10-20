// Driver for Singly Linked List program

public class Driver {

   // method to create a simple linked list with 3 nodes
    public static void main(String[] args) {
        /* Start with the empty list. */
        SinglyLinkedList llist = new SinglyLinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        /* Three nodes have been allocated dynamically.
           We have references to these three blocks as head,
           second and third

           llist.head    	second          	third
           |            	|              	|
           |            	|              	|
           +----+------+ 	+----+------+ 	+----+------+
           | 1  | null | 	| 2  | null | 	|  3 | null |
           +----+------+ 	+----+------+ 	+----+------+ */

        // Link first node with the second node
        llist.head.next = second;


        /*  Now next of the first Node refers to the second.  So they both are linked.

            llist.head    	second          	third
            |            	|              	|
            |            	|              	|
            +----+------+ 	+----+------+ 	+----+------+
            | 1  |  o------>| 2 | null |    | 3 | null |
            +----+------+ 	+----+------+ 	+----+------+ */


        // Link second node with the third node
        second.next = third;

        llist.printList();

        System.out.println("*******");
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 8);
        llist.deleteNode(7);

        llist.printList();


    } // main
} // Driver
