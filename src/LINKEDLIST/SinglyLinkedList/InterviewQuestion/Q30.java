package LINKEDLIST.SinglyLinkedList.InterviewQuestion;


public class Q30 {

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


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;


        for (int i = 0; i < n; i++) {

            fast = fast.next;

        }

        if (fast == null) return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;


        return head;


    }


    public static void main(String[] args) {

        // Q: Reverse nth node from end of the list (leeTCode->19)

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        ListNode ans = removeNthFromEnd(a, 4);
        display(ans);


    }
}
