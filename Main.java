/**
 * Driver for Assignment 1
 */
public class Main {

    public static void main(String[] args) {

        Node head = null;

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        head = LinkedList.listInsert(head, a);
        head = LinkedList.listInsert(head, b);
        head = LinkedList.listInsert(head, c);

        System.out.println("Initial List:");
        LinkedList.printList(head);

        Node found = LinkedList.listSearch(head, 20);
        System.out.println("Search for 20: " +
                (found != null ? "Found" : "Not Found"));

        head = LinkedList.listDelete(head, b);
        System.out.println("After deleting 20:");
        LinkedList.printList(head);
    }
}