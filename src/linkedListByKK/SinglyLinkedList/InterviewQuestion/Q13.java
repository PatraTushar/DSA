package linkedListByKK.SinglyLinkedList.InterviewQuestion;



public class Q13 {

    public static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static void display(Node head1 , Node head2){

        Node temp1=head1;
        Node temp2=head2;

        System.out.println(" linked list 1 ");
        while (temp1!=null){
            System.out.print(temp1.data +" ");
            temp1=temp1.next;
        }

        System.out.println();

        System.out.println(" linked list 2 ");
        while (temp2!=null){
            System.out.print(temp2.data +" ");
            temp2=temp2.next;
        }
        System.out.println();
    }

    static void display2(Node head){

        Node temp=head;

        while(temp!=null){

            System.out.print(temp.data + " ");
            temp=temp.next;

        }

    }


    static Node MergeTwoLL(Node head1,Node head2){

        System.out.println(" After merging ");

        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(100);
        Node t=head;

        while (temp1!=null && temp2!=null){

            if(temp1.data<temp2.data){

                Node newNode=new Node(temp1.data);
                t.next=newNode;
                t=newNode;
                temp1=temp1.next;

            }

            else {

                Node newNode=new Node(temp2.data);
                t.next=newNode;
                t=newNode;
                temp2=temp2.next;


            }
        }

        if(temp1==null) {
            t.next=temp2;
        }

        else {
            t.next=temp1;
        }

        return head.next;

    }

    public static void main(String[] args) {

        // Q: Merge 2 sorted linked list (using extra space i.e O(N))  (leeTCode-->21)

        Node a =new Node(1);
        Node b =new Node(3);
        Node c =new Node(5);
        Node d =new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;

        Node e =new Node(2);
        Node f =new Node(4);
        Node g =new Node(6);
        Node h =new Node(7);

        e.next=f;
        f.next=g;
        g.next=h;

        display(a,e);

        Node Ans=MergeTwoLL(a,e);
        display2(Ans);







    }
}
