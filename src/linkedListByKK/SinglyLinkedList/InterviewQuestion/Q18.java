package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q18 {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    static void display(Node head){

        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }

    static Node reverse(Node head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        if(head.next==null) return head;

        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;


    }

    public static void main(String[] args) {

        // Q: Reverse a linked list  (Recursively)  (leeTCode-->206)

        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
       Node newHead= reverse(a);
        display(newHead);



    }
}
