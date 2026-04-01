package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q25 {

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

    static ListNode duplicateII(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;

        while (head != null) {

            if (head.next != null && head.val == head.next.val) {

                int duplicate = head.val;

                while (head!= null && head.val == duplicate) {
                    head = head.next;
                }
                prev.next = head;

            } else {
                prev = prev.next;
                head = head.next;

            }


        }

        return dummy.next;

    }

    public static void main(String[] args) {


        // Q: Remove duplicate from the sorted list II (leeTCode->82)

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        display(a);
        ListNode ans = duplicateII(a);
        display(ans);


    }
}
