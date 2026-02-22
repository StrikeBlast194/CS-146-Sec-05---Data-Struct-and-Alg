/**
 * Checks if a linked list is a palindrome
 */
public class Palindrome {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Is Palindrome: " + isPalindrome(a));
    }

    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head, fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare halves
        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.key != right.key) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    
}
