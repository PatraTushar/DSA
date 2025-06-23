package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q34 {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    static int lengthOfALoop(Node head) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        Node slow = head;
        Node fast = head;
        boolean hasLoop=false;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){

                hasLoop=true;

                break;

            }

        }

        if(!hasLoop) return 0;


        Node temp = slow;

        if (slow != null) {
            temp = slow.next;
        }
        int length = 1;

        while (temp != slow) {
            length++;
            if (temp != null) temp = temp.next;
        }


        return length ;

    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = c;

        System.out.println(lengthOfALoop(a));

    }
}
