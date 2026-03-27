public class myPractice {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int data) {

            this.val = data;
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


    static ListNode reverse(ListNode head) {

        ListNode PREV = null;
        ListNode CURR = head;
        ListNode NEXT;

        while (CURR != null) {

            NEXT = CURR.next;
            CURR.next = PREV;
            PREV = CURR;
            CURR = NEXT;
        }

        return PREV;
    }


    static ListNode findLeftMiddle(ListNode head) {

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) return slow;

        return prev;


    }

    static boolean isPalindromeLL(ListNode head) {

        if (head == null || head.next == null) return true;

        ListNode middle = findLeftMiddle(head);

        ListNode reverse = reverse(middle.next);

        middle.next = reverse;

        ListNode ptr1 = head;
        ListNode ptr2 = middle.next;

        while (ptr2 != null) {

            if (ptr1.val != ptr2.val) return false;

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return true;

    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(isPalindromeLL(a));


    }
}




