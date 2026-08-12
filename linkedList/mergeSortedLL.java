import java.util.*;

public class mergeSortedLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted linked lists
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node current = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First linked list
        int n1 = sc.nextInt();

        Node head1 = null;
        Node tail1 = null;

        for (int i = 0; i < n1; i++) {
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // Second linked list
        int n2 = sc.nextInt();

        Node head2 = null;
        Node tail2 = null;

        for (int i = 0; i < n2; i++) {
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        Node merged = merge(head1, head2);

        printList(merged);
    }
}
