import java.util.*;

public class reverseGroup {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
       }
     }

     private static Node reverse(Node head, int k){
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        int count =0;
         while(curr != null && count<k){
            
                next = curr.next;
                curr.next= prev;
                prev = curr;
                curr = next;
                count++;
         }
         if(next != null){
            head.next = reverse(next ,k);
         }
         return prev;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            Node value = new Node(val);

            if(head == null){
                head = value;
                tail = value;
            }
            else{
                tail.next = value;
                tail = value;
            }
        }
        Node temp = reverse(head,k);
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        
        
     } 
    
}
