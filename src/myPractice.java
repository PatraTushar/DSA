import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q23;

public class myPractice {

    public static class Node {

        int data;
        Node next;
        Node random;

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

    static Node randomPointers(Node head) {

        if(head==null) return null;

        // Assign the alternate connections

        Node oldTemp = head;
        Node newTemp;

        while (oldTemp != null) {

            Node newNode = new Node(oldTemp.data);
            newTemp = newNode;
            newTemp.next = oldTemp.next;
            oldTemp.next = newTemp;
            oldTemp = oldTemp.next.next;


        }

        // Assign the random pointers

        oldTemp = head;
        newTemp = head.next;

        while (oldTemp != null) {

            if (oldTemp.random == null) {
                newTemp.random = null;

            } else {

                newTemp.random = oldTemp.random.next;
            }

            oldTemp = oldTemp.next.next;
            if (newTemp.next == null) break;
            ;
            newTemp = newTemp.next.next;
        }

        Node dummy = new Node(-1);
        oldTemp = head;
        newTemp = head.next;
        dummy.next = head.next;

        // separate the connections

        while (oldTemp != null) {

            oldTemp.next = newTemp.next; // restore original list
            if (newTemp.next != null) {
                newTemp.next = newTemp.next.next; // connect clone nodes
            }
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        return dummy.next;


    }


    public static void main(String[] args) {

        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a.random = null;
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        display(a);
        Node Ans = randomPointers(a);
        display(Ans);


    }

}