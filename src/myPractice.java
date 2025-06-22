import linkedListByKK.doublyLinkedList.Q1;

public class myPractice {

    public static class Node {

        Node prev;
        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }

    static void twoSum(Node head,int target){




    }





    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(5);
        Node d = new Node(10);
        Node e = new Node(4);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        twoSum(a,18);




    }

}