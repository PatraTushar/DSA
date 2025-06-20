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

    static int sumOfSquares(int n){

        int sum=0;

        while (n!=0){

            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }

        return sum;
    }

    static boolean happyNumber(int n) {

        int slow=n;
        int fast=sumOfSquares(n);

        while (slow!=fast){

            slow=sumOfSquares(fast);
            fast=sumOfSquares(sumOfSquares(slow));


        }

        return slow==1;










    }


    public static void main(String[] args) {

//        Node a = new Node(7);
//        Node b = new Node(13);
//        Node c = new Node(11);
//        Node d = new Node(10);
//        Node e = new Node(1);
//        Node f = new Node(1);
//
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;


        System.out.println(happyNumber(19));
        System.out.println(happyNumber(89));


    }

}