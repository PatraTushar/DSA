package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q24 {

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

    static ListNode deepCopy(ListNode head) {


        ListNode ptr1 = head;
        ListNode dummy = new ListNode(-1);
        ListNode ptr2 = dummy;

        while (ptr1 != null) {

            ListNode newNode = new ListNode(ptr1.val);
            ptr2.next = newNode;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // Q: Deep copy

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(99);
        ListNode d = new ListNode(101);
        ListNode e = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        ListNode Ans = deepCopy(a);
        display(Ans);

    }
}
