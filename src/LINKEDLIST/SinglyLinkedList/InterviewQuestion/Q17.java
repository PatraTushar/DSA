package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q17 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }

    }


    static ListNode deleteDuplicates(ListNode head) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        ListNode curr = head;
        ListNode temp;

        while (curr != null && curr.next != null) {

            if (curr.val == curr.next.val) {


                temp = curr.next;

                while (temp != null && temp.val == curr.val) {

                    temp = temp.next;
                }

                curr.next = temp;
                curr = temp;


            } else {

                curr = curr.next;


            }
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

        // Q : Remove duplicate from sorted list I  (leeTCode->83)

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(3);
        ListNode g = new ListNode(4);
        ListNode h = new ListNode(4);
        ListNode i = new ListNode(5);
        ListNode j = new ListNode(6);
        ListNode k = new ListNode(6);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;

        display(a);
        ListNode Ans = deleteDuplicates(a);
        display(Ans);


    }
}
