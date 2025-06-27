package linkedListByStriver.SinglyLinkedList.InterviewQuestion;

public class Q33 {

    public static class Node {


        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }

    static Node reverse(Node head){

        Node curr=head;
        Node prev=null;
        Node Agla;

        while (curr!=null){
            Agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Agla;
        }

        return prev;

    }

    static Node plusOne(Node head){

        //Time Complexity: O(n)
        //Space Complexity: O(n)



        Node temp=reverse(head);
        int carry=1;
        Node dummy=new Node(-1);
        Node d1=dummy;

        while (temp!=null){

            int sum=temp.data+carry;

            int digit=sum%10;
            carry=sum/10;

            Node newNode=new Node(digit);
            d1.next=newNode;
            d1=newNode;
            temp=temp.next;

        }

        if (carry > 0) {
            d1.next = new Node(carry);
        }




        return reverse(dummy.next);




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

        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(2);

        a.next = b;
        b.next = c;

        display(a);
        Node Ans=plusOne(a);
        display(Ans);



    }
}
