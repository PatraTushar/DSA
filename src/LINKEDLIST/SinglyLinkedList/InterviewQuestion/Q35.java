package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q35 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode deleteMiddle(ListNode head) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        // for even right middle

        if (head==null || head.next==null) return null;

        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){

            prev=slow;
            slow=slow.next;
            fast=fast.next.next;


        }



        prev.next=slow.next;

        return head;




    }

    static void display(ListNode head) {

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        ListNode Ans = deleteMiddle(a);
        display(Ans);


    }
}
