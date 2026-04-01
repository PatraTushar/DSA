package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q28 {


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

    static ListNode reverse(ListNode head){

        if(head==null || head.next==null) return head;

        ListNode curr=head;
        ListNode prev=null;
        ListNode agla=null;

        while (curr!=null){

            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;

        }

        return prev;

    }

    static void reorderSet(ListNode head){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)



        ListNode slow=head;
        ListNode fast=head;


        while ( fast.next!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }


        ListNode rev2ndHalf=reverse(slow.next);
        slow.next=null;

        ListNode pointer1=head;
        ListNode pointer2=rev2ndHalf;



        while (pointer1 != null &&pointer2!=null){

            ListNode temp1 = pointer1.next;
            ListNode temp2 = pointer2.next;

            pointer1.next = pointer2;
            pointer2.next = temp1;

            pointer1 = temp1;
            pointer2 = temp2;




        }

        display(head);



    }

    public static void main(String[] args) {

        // Q: Reorder list (leeTCode->143)

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);


        reorderSet(a);



    }
}
