package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q4 {

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

    static void deleteNthNodeFromEnd(ListNode head, int n) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        ListNode slow = head;
        ListNode fast = head;


        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            System.out.println("Cannot delete head node in this implementation");
            return;
        }


        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
    }

    public static void main(String[] args) {

        // Q: Delete nth node from end of the linked list(in one traversal)  here head node cant be deleted

        ListNode a = new ListNode(100);
        ListNode b = new ListNode(15);
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
        deleteNthNodeFromEnd(a, 1);
        display(a);


    }
}
