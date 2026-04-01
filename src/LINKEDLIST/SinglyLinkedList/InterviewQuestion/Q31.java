package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q31 {

    public static class ListNode {

        int val;

        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }

    static ListNode AddNumbers(ListNode l1, ListNode l2) {

        // Time Complexity (TC): O(max(N, M))
        //Space Complexity (SC): O(max(N, M))
        //Where:
        //N = number of nodes in l1
        //M = number of nodes in l2


        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;

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

        // Add Two Numbers  (leeTCode->2)

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        ListNode f = new ListNode(4);
        ListNode g = new ListNode(1);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(5);
        ListNode j = new ListNode(2);

        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        ListNode Ans = AddNumbers(a, f);
        display(Ans);


    }
}
