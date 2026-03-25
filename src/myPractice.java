public class myPractice {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int data) {

            this.val = data;
        }
    }

    static void display(ListNode node) {

        ListNode temp = node;

        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static ListNode nthNodeFromEnd(ListNode head, int n) {


        ListNode slow = head;
        ListNode fast = head;


        for (int i = 0; i < n; i++) {

            if (fast == null) return head;
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


        ListNode a = new ListNode(100);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(12);
        ListNode f = new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);

        nthNodeFromEnd(a, 4);

        display(a);


    }
}




