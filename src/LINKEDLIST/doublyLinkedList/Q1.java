package LINKEDLIST.doublyLinkedList;

public class Q1 {

    public static class ListNode {

        ListNode prev;
        int val;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }

    static boolean isPalindrome(ListNode head) {

        ListNode right = head;
        while (right.next != null) {
            right = right.next;
        }

        ListNode left = head;


        while (left != null && right != null && left != right && left.prev != right) {


            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.prev;

        }

        return true;


    }

    public static void main(String[] args) {

        // Q: Palindrome Doubly Linked List


        ListNode a = new ListNode(4);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(10);
        ListNode e = new ListNode(4);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        System.out.println(isPalindrome(a));


    }
}
