package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q24 {

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
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node deepCopy(Node head){

        Node temp1=head;
        Node h=new Node(-1);
        Node temp2=h;

        while (temp1!=null){
            Node a=new Node(temp1.data);
            temp2.next=a;
            temp2=temp2.next;
            temp1=temp1.next;
        }

        h=h.next;
        return h;
    }

    public static void main(String[] args) {

        // Q: Deep copy

        Node a=new Node(1);
        Node b=new Node(10);
        Node c=new Node(99);
        Node d=new Node(101);
        Node e=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
        Node Ans=deepCopy(a);
        display(Ans);

    }
}
