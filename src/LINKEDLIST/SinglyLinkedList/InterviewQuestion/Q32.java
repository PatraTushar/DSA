package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q32 {

    public static class ListNode {


        int val;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }


    static ListNode count0s1sAnd2s(ListNode head){

        // Brute force

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)



        int count0=0;
        int count1=0;
        int count2=0;
        ListNode temp=head;


        while (temp!=null){

            if(temp.val ==0){
                count0++;
            }
            else if(temp.val ==1){
                count1++;
            }
            else {
                count2++;
            }

            temp=temp.next;

        }


        temp=head;

        while (temp!=null){

            if(count0!=0){
                temp.val =0;
                count0--;
            }

            else if(count1!=0){

                temp.val =1;
                count1--;

            }

            else {

                temp.val =2;
                count2--;

            }

            temp=temp.next;
        }

        return head;

    }

    static ListNode Sort0s1s2s(ListNode head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        if(head==null) return null;


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

    static void display(ListNode head){

        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
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
        ListNode Ans= Sort0s1s2s(a);
        display(Ans);


    }


}
