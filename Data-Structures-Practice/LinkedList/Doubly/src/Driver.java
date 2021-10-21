// driver for doubly linked list program

public class Driver {

    public static void main(String[] args) {

         // Start with the empty list
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert 2. So linked list becomes 2->NULL
        dll.push(2);

        // Insert 4. So linked list becomes 4->2->NULL
        dll.push(4);

        // Insert 8. So linked list becomes 8->4->2->NULL
        dll.push(8);

        // Insert 10. So linked list becomes 10->8->4->2->NULL
        dll.push(10);

        System.out.print("Created DLL is: ");
        dll.printlist(dll.head);

        // Deleting first node
        dll.deleteNode(dll.head);

        // List after deleting first node
        // 8->4->2
        System.out.print("\nList after deleting first node: ");
        dll.printlist(dll.head);

        // Deleting middle node from 8->4->2
        dll.deleteNode(dll.head.next);

        System.out.print("\nList after Deleting middle node: ");
        dll.printlist(dll.head);

    } // main

} // Driver
