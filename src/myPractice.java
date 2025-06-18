import OopsByKK.AccessModifier.Public.A;

public class myPractice {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }

    static Node cycleII(Node head){

        if(head==null || head.next==null) return null;

        Node slow=head;
        Node fast=head;


        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) break;
        }

        if(fast==null || fast.next==null) return null;


        Node temp=head;


        while (temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }

        return slow;


    }


    public static void main(String[] args) {

        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(13);
        Node d = new Node(43);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);



        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next=b;

        Node Ans=cycleII(a);
        System.out.println(Ans.data);



    }

}