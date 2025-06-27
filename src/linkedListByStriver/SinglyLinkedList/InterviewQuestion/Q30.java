package linkedListByStriver.SinglyLinkedList.InterviewQuestion;


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

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)



        if(head==null) return null;

        Node slow=head;
        Node fast=head;


        for(int i=0;i<n;i++){

            fast=fast.next;

        }

        if(fast==null) return head.next;

        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        if(slow.next==null) return head;
        slow.next=slow.next.next;



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
        Node ans=removeNthFromEnd(a,4);
        display(ans);



    }
}
