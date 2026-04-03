package LINKEDLIST.doublyLinkedList;


public class Q2 {

    public static class ListNode {

        ListNode prev;
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    static void twoSum(ListNode head, int target) {

        ListNode right = head;

        while (right.next != null) {
            right = right.next;
        }

        ListNode left = head;


        while (left != right) {

            int sum=left.val+right.val;

            if (sum == target) {
                System.out.println(" pairs found " + left.val + " " + right.val);
                return;
            } else if (sum > target) {

                right = right.prev;

            } else {

                left = left.next;
            }
        }

        System.out.println(" No pair found ");


    }


    public static void main(String[] args) {


        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(13);
        ListNode e = new ListNode(100);

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

        int target = 18;
        twoSum(a, target);


    }
}

