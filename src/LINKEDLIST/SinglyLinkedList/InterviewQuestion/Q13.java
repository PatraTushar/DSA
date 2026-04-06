package LINKEDLIST.SinglyLinkedList.InterviewQuestion;



public class Q13 {

    public static class ListNode {

        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    static void display(ListNode head1 , ListNode head2){

        ListNode temp1=head1;
        ListNode temp2=head2;

        System.out.println(" linked list 1 ");
        while (temp1!=null){
            System.out.print(temp1.val +" ");
            temp1=temp1.next;
        }

        System.out.println();

        System.out.println(" linked list 2 ");
        while (temp2!=null){
            System.out.print(temp2.val +" ");
            temp2=temp2.next;
        }
        System.out.println();
    }

    static void display2(ListNode head){

        ListNode temp=head;

        while(temp!=null){

            System.out.print(temp.val + " ");
            temp=temp.next;

        }

    }


    static ListNode MergeTwoLL(ListNode head1, ListNode head2){

        System.out.println(" After merging ");

        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode dummy=new ListNode(100);
        ListNode t=dummy;

        while (temp1!=null && temp2!=null){

            if(temp1.val <temp2.val){

                ListNode newListNode =new ListNode(temp1.val);
                t.next= newListNode;
                t= newListNode;
                temp1=temp1.next;

            }

            else {

                ListNode newListNode =new ListNode(temp2.val);
                t.next= newListNode;
                t= newListNode;
                temp2=temp2.next;


            }
        }

        if(temp1==null) {
            t.next=temp2;
        }

        else {
            t.next=temp1;
        }

        return dummy.next;

    }

    public static void main(String[] args) {

        // Q: Merge 2 sorted linked list (using extra space i.e O(N))  (leeTCode-->21)

        ListNode a =new ListNode(1);
        ListNode b =new ListNode(3);
        ListNode c =new ListNode(5);
        ListNode d =new ListNode(8);

        a.next=b;
        b.next=c;
        c.next=d;

        ListNode e =new ListNode(2);
        ListNode f =new ListNode(4);
        ListNode g =new ListNode(6);
        ListNode h =new ListNode(7);

        e.next=f;
        f.next=g;
        g.next=h;

        display(a,e);

        ListNode Ans=MergeTwoLL(a,e);
        display2(Ans);







    }
}
