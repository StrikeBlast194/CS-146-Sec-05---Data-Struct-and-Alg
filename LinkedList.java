/**
 * Implements basic linked list operations
 */ 
public class LinkedList {

	// Insert node at the head
    public static Node listInsert(Node head, Node x) {
        x.next = head;
        return x;
    }

    // Search for a node by key
    public static Node listSearch(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Delete a given node
    public static Node listDelete(Node head, Node x) {

        if (head == null || x == null) {
            return head;
        }

        // If deleting head
        if (head == x) {
            return head.next;
        }

        Node current = head;
        while (current.next != null && current.next != x) {
            current = current.next;
        }

        if (current.next == x) {
            current.next = x.next;
        }

        return head;
    }

    // Print list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " => ");
            current = current.next;
        }
        System.out.println("null");
    }
}
