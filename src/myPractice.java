public class myPractice {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    static void display(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println();

    }

    static Node reverse(Node head) {

        if (head == null) return null;

        Node prev = null;
        Node curr = head;
        Node agla;

        while (curr != null) {

            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;


    }



    static Node deleteFromEnd(Node head, int n) {

        if(head==null) return null;

        Node slow=head;
        Node fast=head;


        for(int i=0;i<n;i++){

            fast=fast.next;

        }

        if(fast==null) return head.next;

        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        if(slow.next==null) return head;
        slow.next=slow.next.next;



        return head;


    }


    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
        Node i = new Node(90);
        Node j = new Node(100);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        int n=10;

        display(a);
        Node Ans = deleteFromEnd(a,n);
        display(Ans);


    }

}