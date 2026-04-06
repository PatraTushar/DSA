package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q5 {

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

    static ListNode deleteNthNodeFromEnd(ListNode head, int n) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {

            if (fast == null) return head;    // if n is greater than the length
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

        // Q: Delete nth node from end of the linked list(in one traversal)  here head node is deleted

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

//        Node node3rd=deleteNthNode(a,3);
//        display(node3rd);

        ListNode listNode6Th = deleteNthNodeFromEnd(a, 4);
        display(listNode6Th);


    }
}
