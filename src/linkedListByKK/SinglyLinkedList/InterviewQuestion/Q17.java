package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q17 {

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

    static Node duplicateListI(Node head){
        Node temp=head;
        while (temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }

            else {
                temp=temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        // Q : Remove duplicate from sorted list I  (leeTCode->83)

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        Node ans=duplicateListI(a);
        display(ans);



    }
}
