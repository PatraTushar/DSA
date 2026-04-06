package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q9 {

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

    static ListNode deleteRightMiddle(ListNode head){

        if (head==null || head.next==null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next=slow.next;

        return head;


    }

    public static void main(String[] args) {

        // Q: Delete the middle element of linked list for odd and right middle for even  (leeTCode->2095)

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(10);
        ListNode d=new ListNode(13);
        ListNode e=new ListNode(12);
        ListNode f=new ListNode(20);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        ListNode Ans=deleteRightMiddle(a);
        display(Ans);



    }
}
