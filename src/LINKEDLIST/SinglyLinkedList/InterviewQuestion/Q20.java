package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class   Q20 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val){

            this.val = val;
        }
    }

   public static ListNode rev(ListNode head){

        ListNode curr=head;
        ListNode prev=null;
        ListNode agla;

        while (curr!=null){

            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;

        }

        return prev;
    }


    static boolean isPalindromeLL(ListNode head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp=rev(slow.next);
        slow.next=temp;

        ListNode p1=head;
        ListNode p2=slow.next;

        while ( p2!=null){

            if(p1.val !=p2.val) return false;

            p1=p1.next;
            p2=p2.next;
        }

        return true;


    }

    public static void main(String[] args) {

        // Q: palindrome linked list (leeTCode-->234)

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(2);
        ListNode f=new ListNode(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(isPalindromeLL(a));


    }
}
