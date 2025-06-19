


public class myPractice {

    public static class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {

            this.data = data;
        }
    }


    static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println();

    }

    static ListNode oddEvenLL(ListNode head) {

        ListNode oddPlace = new ListNode(-1);
        ListNode evenPlace = new ListNode(-1);

        if(head==null) return null;
        if(head.next==null) return head;

        ListNode o1 = oddPlace;
        ListNode e1 = evenPlace;
        ListNode temp = head;

        while (temp != null) {

            o1.next = temp;
            o1 = temp;
            temp = temp.next;
            e1.next = temp;
            e1 = temp;
            if(temp==null) break;
            temp = temp.next;
        }

        o1.next = evenPlace.next;


        return oddPlace.next;


    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        display(a);
        ListNode Ans=oddEvenLL(a);
        display(Ans);

    }

}