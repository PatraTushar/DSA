package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q36 {

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

        // for even left middle

        ListNode slow = head;
        ListNode fast = head;

        if(fast==null) return null;
        if (fast.next==null) return head;
        fast=fast.next.next;

        while (fast != null && fast.next != null && fast.next.next!=null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null && slow.next != null) slow.next = slow.next.next;

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
