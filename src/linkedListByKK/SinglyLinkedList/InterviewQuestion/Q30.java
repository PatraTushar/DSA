package linkedListByKK.SinglyLinkedList.InterviewQuestion;


public class Q30 {

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


    public static Node removeNthFromEnd(Node head, int n) {

        if(head.next==null) return null;

        Node temp=head;
        int length=0;

        while(temp!=null){
            temp=temp.next;
            length++;
        }

        if(length==n) return head.next;

        temp=head;

        int t=length-n;

        for(int i=0;i<t-1;i++){

            temp=temp.next;

        }

        temp.next=temp.next.next;


        return head;

    }



    public static void main(String[] args) {

        // Q: Reverse nth node from end of the list (leeTCode->19)

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
        Node ans=removeNthFromEnd(a,2);
        display(ans);



    }
}
