package linkedListByKK.doublyLinkedList;

public class Q1 {

   public static class Node{

        Node prev;
        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    static boolean isPalindrome(Node head){

       Node temp=head;

       while (temp.next!=null){
           temp=temp.next;
       }

       Node h=head;
       Node t=temp;

       while (h!=t){
           if (h.data!=t.data){
               return false;
           }

           h=h.next;
           t=t.prev;
       }

       return true;
    }

    public static void main(String[] args) {

        // Q: Palindrome Doubly Linked List


        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(5);
        Node d=new Node(10);
        Node e=new Node(4);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        System.out.println(isPalindrome(a));


    }
}
