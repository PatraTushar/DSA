package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q18 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val){

            this.val = val;
        }
    }

    static void display(ListNode head){

        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.val +" ");
        display(head.next);
    }

    static ListNode reverse(ListNode head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        if(head.next==null) return head;

        ListNode newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;


    }

    public static void main(String[] args) {

        // Q: Reverse a linked list  (Recursively)  (leeTCode-->206)

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
       ListNode newHead= reverse(a);
        display(newHead);



    }
}
