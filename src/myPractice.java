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


    static ListNode sort(ListNode head) {

        ListNode zeroes = new ListNode(-1);
        ListNode z = zeroes;
        ListNode ones = new ListNode(-1);
        ListNode o = ones;
        ListNode twos = new ListNode(-1);
        ListNode t = twos;
        ListNode temp = head;


        while (temp != null) {

            if (temp.val == 0) {

                z.next = temp;
                z = z.next;
                temp = temp.next;


            } else if (temp.val == 1) {

                o.next = temp;
                o = o.next;
                temp = temp.next;


            } else {

                t.next = temp;
                t = t.next;
                temp = temp.next;


            }
        }


        z.next = ones.next != null ? ones.next : twos.next;
        o.next = twos.next != null ? twos.next : null;
        t.next = null;

        return zeroes.next;


    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(0);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);
        ListNode g = new ListNode(0);
        ListNode h = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        ListNode Ans = sort(a);
        display(Ans);


    }


}





