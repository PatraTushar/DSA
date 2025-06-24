public class myPractice {

    public static class Node {


        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    static Node findIntersection(Node headA, Node headB){

        //Time Complexity: O(n + m)
        //Space Complexity: O(1)

        Node temp1=headA;
        Node temp2=headB;

        int length1=0;
        int length2=0;

        while (temp1!=null){
            length1++;
            temp1=temp1.next;
        }

        while (temp2!=null){
            length2++;
            temp2=temp2.next;
        }

        if(length1>length2){

            return findIntersection(headB,headA);

        }

        Node slow=headA;
        Node fast=headB;

        int lengthDiff=length2-length1;

        for(int i=0;i<lengthDiff;i++){
            fast=fast.next;
        }

        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }





    static void display(Node head){

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node a=new Node(87);
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







    }

}