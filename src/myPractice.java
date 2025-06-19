


public class myPractice {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int data) {

            this.val = data;
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

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode t=dummy;
        ListNode temp=head;

        while (temp!=null){

            if(t.val !=temp.val){

                t.next=temp;
                t=temp;
                temp=temp.next;
            }

            else {

                while (t.val ==temp.val){
                    temp=temp.next;
                    if(temp==null) break;

                }
                t.next=temp;


            }
        }

        return dummy.next;




    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(3);
        ListNode g = new ListNode(4);
        ListNode h = new ListNode(4);
        ListNode i = new ListNode(4);
        ListNode j = new ListNode(5);
        ListNode k = new ListNode(5);
        ListNode l = new ListNode(6);

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
        k.next = l;

        display(a);
        ListNode Ans=removeDuplicates(a);
        display(Ans);


    }

}