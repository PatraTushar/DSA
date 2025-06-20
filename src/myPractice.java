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

    static ListNode reverseLL2(ListNode head, int left, int right) {

        if(head==null) return null;


        ListNode pointer1 = head;



        for (int i = 1; i < left-1 ; i++) {

            pointer1 = pointer1.next;

        }

        ListNode pointer2;

        if(left==1){
            pointer2=pointer1;
        }

        else {
            pointer2=pointer1.next;
        }




        ListNode prev = null;
        ListNode curr = pointer2;
        ListNode Agla;


        for (int i = 1; i <= right-left + 1; i++) {

            Agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Agla;

        }

        if(left==1){
            pointer1.next=curr;
            return prev;
        }
        else {

            pointer1.next = prev;
            pointer2.next = curr;
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
        ListNode Ans=reverseLL2(a,3,7);
        display(Ans);


    }

}