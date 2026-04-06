import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q11;
import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q13;
import OOPS.AccessModifier.Public.A;

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

    static ListNode MergeTwoLL(ListNode head1, ListNode head2) {





    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(8);

        a.next = b;
        b.next = c;
        c.next = d;

        ListNode e = new ListNode(2);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(6);
        ListNode h = new ListNode(7);

        e.next = f;
        f.next = g;
        g.next = h;

        display(a, e);

        ListNode Ans = MergeTwoLL(a, e);
        display2(Ans);


    }
}





