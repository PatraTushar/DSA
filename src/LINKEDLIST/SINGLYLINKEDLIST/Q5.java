package LINKEDLIST;

public class Q5 {

    public static Node intersection(Node headA,Node headB){

        Node tempA=headA;
        int lengthA=0;
        while(tempA!=null){

            lengthA++;
            tempA=tempA.next;


        }


        Node tempB=headB;
        int lengthB=0;

        while(tempB!=null){

            lengthB++;
            tempB=tempB.next;

        }

        tempA=headA;
        tempB=headB;

        if(lengthA>lengthB){

            int steps=lengthA-lengthB;

            for(int i=0;i<steps;i++){
                tempA=tempA.next;
            }

        }

        else{
            int steps=lengthB-lengthA;
            for(int i=0;i<steps;i++){
                tempB=tempB.next;
            }
        }


        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }

        return tempA;






    }

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(81);
        Node b=new Node(100);
        Node c=new Node(13);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(12);
        Node g=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;


        Node p=new Node(90);
        Node q=new Node(9);
        p.next=q;
        q.next=e;
        e.next=f;
        f.next=g;

       Node ans= intersection(a,p);
        System.out.println(" intersection of both the linked list is " +ans.data);







    }
}
