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

    static ListNode removeDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next!=null) {

            if (curr.val == curr.next.val) {

                int duplicate = curr.val;
                ListNode temp = curr.next;

                while (temp != null && temp.val == duplicate) {

                    temp = temp.next;

                }

                curr.next=temp;
                curr=temp;


            } else {

                curr = curr.next;
            }

        }

        return head;


    }


    public static void main(String[] args) {

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
        ListNode Ans = removeDuplicates(a);
        display(Ans);

    }
}





