package LINKEDLIST;

public class Q10 {

    static void display(Node head){

        Node temp=head;

        while(temp!=null){

            System.out.print(temp.data + " ");
            temp=temp.next;

        }

    }

    public static Node mergeSort(Node headA,Node headB){

        Node tempA=headA;
        Node tempB=headB;
        Node head=new Node(100);
        Node temp=head;


        while(tempA!=null && tempB!=null){
            if(tempA.data<tempB.data){

                Node a=new Node(tempA.data);
                temp.next=a;
                temp=a;
                tempA=tempA.next;
            }

            else{
                Node a=new Node(tempB.data);
                temp.next=a;
                temp=a;
                tempB=tempB.next;
            }
        }

        if(tempA==null){
            temp.next=tempB;
        }

        else{
            temp.next=tempA;
        }

        return head.next;



    }

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {

        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(8);
        Node e=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        Node p=new Node(2);
        Node q=new Node(4);
        Node r=new Node(6);
        Node s=new Node(7);


        p.next=q;
        q.next=r;
        r.next=s;

        Node ans=mergeSort(a,p);
        display(ans);




    }
}
