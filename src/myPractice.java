import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q1;

public class myPractice {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    static Node NthNodeFromLast(Node head,int n){

        Node slow=head;
        Node fast=head;

        for(int i=0;i<n;i++){

           fast=fast.next;

        }

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }



        return slow;



    }

    static void display(Node head){

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();


    }


    public static void main(String[] args) {


        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(9);
        Node e=new Node(19);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node ans=NthNodeFromLast(a,2);
        System.out.println(ans.data);



    }

}