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

    static ListNode reverse(ListNode head) {

        if (head == null) return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode agla;

        while (curr !=null) {

            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;


    }

    static ListNode reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) return head;

        ListNode slow=head;
        ListNode fast=head;


        while ( fast.next!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }


        ListNode rev2ndHalf=reverse(slow.next);
        slow.next=null;

        ListNode pointer1=head;
        ListNode pointer2=rev2ndHalf;

        while (pointer2!=null){

            ListNode temp1 = pointer1.next;
            ListNode temp2 = pointer2.next;

            pointer1.next = pointer2;
            pointer2.next = temp1;

            pointer1 = temp1;
            pointer2 = temp2;




        }

        return head;













    }


    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        ListNode g = new ListNode(70);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        display(a);
        ListNode Ans=reorderList(a);
        display(Ans);


    }

}