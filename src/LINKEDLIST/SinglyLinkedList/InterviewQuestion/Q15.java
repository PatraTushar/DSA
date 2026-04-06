package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q15 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val){

            this.val = val;
        }

    }

    static void display(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void oddEvenSplit(ListNode head){

        //Time Complexity: O(N)
        //Space Complexity: O(1)


        ListNode temp = head;
        ListNode dummyOdd = new ListNode(101);
        ListNode odd = dummyOdd;
        ListNode dummyEven = new ListNode(100);
        ListNode even = dummyEven;

        while (temp != null) {

            if (temp.val % 2 != 0) {

                odd.next = temp;
                odd = temp;

            } else {

                even.next = temp;
                even = temp;

            }

            temp = temp.next;
        }


        odd.next=null;
        even.next=null;

        display(dummyOdd.next);
        display(dummyEven.next);






    }

    public static void main(String[] args) {

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(7);
        ListNode h=new ListNode(8);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        System.out.println(" original list ");
        display(a);
        oddEvenSplit(a);
    }
}
