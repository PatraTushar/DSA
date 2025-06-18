import OopsByKK.AccessModifier.Public.A;
import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q14;


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
        g.next = b;

        Node Ans = cycleII(a);
        System.out.println(Ans.data);

        static Node merge2SortedLL (Node head1, Node head2){

            Node temp1 = head1;
            Node temp2 = head2;
            Node dummy = new Node(-100);
            Node t = dummy;


            while (temp1 != null && temp2 != null) {

                if (temp1.data < temp2.data) {

                    t.next = temp1;
                    t = temp1;
                    temp1 = temp1.next;
                } else {

                    t.next = temp2;
                    t = temp2;
                    temp2 = temp2.next;
                }


            }

            if (temp1 == null) {

                t.next = temp2;

            } else {
                t.next = temp1;
            }

            return dummy.next;


        }

        static void display (Node head){

            Node temp = head;

            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;

            }

        }

        public static void main(String[] args){

            Node a = new Node(1);
            Node b = new Node(3);
            Node c = new Node(5);
            Node d = new Node(8);

            a.next = b;
            b.next = c;
            c.next = d;

            Node e = new Node(2);
            Node f = new Node(4);
            Node g = new Node(6);
            Node h = new Node(7);

            e.next = f;
            f.next = g;
            g.next = h;


        }

    }