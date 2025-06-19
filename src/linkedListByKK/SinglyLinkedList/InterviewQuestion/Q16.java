package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q16 {

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

    static Node oddEvenLL(Node head) {

        //Time Complexity: O(N)
        //Space Complexity: O(1)

        Node oddPlace = new Node(-1);
        Node evenPlace = new Node(-1);

        if(head==null) return null;
        if(head.next==null) return head;

        Node o1 = oddPlace;
        Node e1 = evenPlace;
        Node temp = head;

        while (temp != null) {

            o1.next = temp;
            o1 = temp;
            temp = temp.next;
            e1.next = temp;
            e1 = temp;
            if(temp==null) break;
            temp = temp.next;
        }

        o1.next = evenPlace.next;


        return oddPlace.next;


    }



    public static void main(String[] args) {

        // Q: odd even linked list

        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(4);
        Node g = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        display(a);
        Node Ans=oddEvenLL(a);
        display(Ans);

    }
}
