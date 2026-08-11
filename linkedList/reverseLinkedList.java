import java.util.*;

public class reverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int vl = sc.nextInt();

            Node value = new Node(vl);

            if (head == null) {
                head = value;
                tail = value;
            } else {
                tail.next = value;
                tail = value;
            }
        }

        head = reverse(head);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

