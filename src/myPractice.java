import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q2;

public class myPractice {


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

    static ListNode nthNodeFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;


        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;


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

        ListNode ans = nthNodeFromEnd(a, 4);
        System.out.println(ans.val);

    }

}





