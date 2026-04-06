package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q10 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static void display(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static ListNode deleteLeftMiddle(ListNode head) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if (head == null || head.next == null) return null;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev == null) return head.next;
        prev.next = slow.next;

        return head;


    }


    public static void main(String[] args) {

        // Q: Delete the middle element of linked list for odd and left middle for even

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(13);
        ListNode e = new ListNode(12);
        ListNode f = new ListNode(20);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        ListNode Ans = deleteLeftMiddle(a);
        display(Ans);


    }
}
