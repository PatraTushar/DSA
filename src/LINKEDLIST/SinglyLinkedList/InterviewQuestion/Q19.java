package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q19 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val){

            this.val = val;
        }
    }

    static void display(ListNode head){

        ListNode temp=head;

        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static ListNode reverseALL(ListNode head){

        ListNode prev=null;
        ListNode curr=head;
        ListNode agla;

        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }

        return prev;
    }

    public static void main(String[] args) {

        // Q: Reverse a linked list (Iterative)  (leeTCode-->206)

        ListNode a=new ListNode(3);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(2);
        ListNode e=new ListNode(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
        ListNode rev=reverseALL(a);
        display(rev);



    }
}
