package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q11 {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static boolean cycleInALinkedListI(Node head){

        Node slow=head;
        Node fast=head;

        while (fast!=null){
            if(slow==null) return false;
            slow=slow.next;

            if (fast.next==null) return false;
            fast=fast.next.next;

            if(fast==slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Q: Cycle in a linked list I  (leeTCode-->141)

        // Input 1
        Node a =new Node(3);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(-4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;

        System.out.println(cycleInALinkedListI(a));

        // Input 2

        Node e=new Node(1);
        Node f=new Node(2);
        e.next=f;
        f.next=e;

        System.out.println(cycleInALinkedListI(e));

        // Input 3

        Node g=new Node(1);
        System.out.println(cycleInALinkedListI(g));










    }
}
