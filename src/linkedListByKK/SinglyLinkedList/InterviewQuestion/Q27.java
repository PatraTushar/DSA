package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q27 {

    public static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node reverseBetween(Node head, int left, int right) {


        Node Dummy=new Node(0);
        Dummy.next=head;
        Node t=Dummy;
        Node temp=head;

        for(int i=0;i<left-1;i++){
            t=t.next;
            temp=temp.next;
        }

        Node curr=temp;
        Node prev=null;
        Node Agla=null;

        for(int i=0;i<right-left+1;i++){
            Agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Agla;
        }

        t.next=prev;
        temp.next=curr;

        return Dummy.next;

    }

    public static void main(String[] args) {

        // Q: reverse linked list II (leeTCode->92)

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);

        Node Ans=reverseBetween(a,2,4);
        display(Ans);

    }
}
