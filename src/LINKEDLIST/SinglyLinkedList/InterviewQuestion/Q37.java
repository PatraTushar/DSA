package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q37 {

    public static class ListNode {

        ListNode prev;
        int val;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }

    static ListNode deleteKeys(ListNode head, int key) {

        //Time Complexity (TC): O(N)
        //Space Complexity (SC): O(1)

        ListNode temp = head;

        while (temp != null) {

            if (temp.val == key) {

                if (temp==head) head=temp.next;

                if (temp.prev!=null)  temp.prev.next=temp.next;

                if (temp.next!=null) temp.next.prev=temp.prev;
            }

            temp=temp.next;


        }


        return head;

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

        // Delete All occurrences of key in DLL

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(10);
        ListNode e = new ListNode(6);

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

        display(a);
        int key = 10;
        ListNode Ans = deleteKeys(a, key);
        display(Ans);


    }
}
