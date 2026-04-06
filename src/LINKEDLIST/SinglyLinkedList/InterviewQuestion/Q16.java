package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q16 {

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

    static ListNode oddEvenLL(ListNode head) {

        //Time Complexity: O(N)
        //Space Complexity: O(1)

        if (head == null) return null;
        if (head.next == null) return head;

        ListNode dummyOdd = new ListNode(-1);
        ListNode oddPtr = dummyOdd;
        ListNode dummyEven = new ListNode(-1);
        ListNode evenPtr = dummyEven;
        ListNode temp = head;

        while (temp != null) {

            oddPtr.next = temp;
            oddPtr = temp;
            temp = temp.next;
            evenPtr.next = temp;
            evenPtr = temp;
            if (temp == null) break;
            temp = temp.next;

        }


        oddPtr.next = dummyEven.next;


        return dummyOdd.next;



    }



    public static void main(String[] args) {

        // leeTCode->328

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        display(a);
        ListNode Ans=oddEvenLL(a);
        display(Ans);

    }
}
