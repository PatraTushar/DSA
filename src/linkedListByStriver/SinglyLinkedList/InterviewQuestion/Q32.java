package linkedListByStriver.SinglyLinkedList.InterviewQuestion;

public class Q32 {

    public static class Node {


        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    static Node count0s1sAnd2s(Node head){

        // Brute force

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)



        int count0=0;
        int count1=0;
        int count2=0;
        Node temp=head;


        while (temp!=null){

            if(temp.data==0){
                count0++;
            }
            else if(temp.data==1){
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
                temp.data=0;
                count0--;
            }

            else if(count1!=0){

                temp.data=1;
                count1--;

            }

            else {

                temp.data=2;
                count2--;

            }

            temp=temp.next;
        }

        return head;

    }

    static Node Sort0s1s2s(Node head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        if(head==null) return null;

        Node dummy1=new Node(-1);
        Node d1=dummy1;
        Node dummy2=new Node(-1);
        Node d2=dummy2;
        Node dummy3=new Node(-1);
        Node d3=dummy3;

        Node temp=head;

        while (temp!=null){

            if(temp.data==0){
                d1.next=temp;
                d1=d1.next;
            }

            else if(temp.data==1){
                d2.next=temp;
                d2=d2.next;
            }

            else {

                d3.next=temp;
                d3=d3.next;

            }


            temp=temp.next;
        }

        d1.next = (dummy2.next != null) ? dummy2.next : dummy3.next;
        d2.next = (dummy3.next!=null) ? dummy3.next : null;
        d3.next = null;

        return dummy1.next;
    }

    static void display(Node head){

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(2);
        Node d = new Node(0);
        Node e = new Node(2);
        Node f = new Node(1);
        Node g = new Node(0);
        Node h = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        Node Ans= Sort0s1s2s(a);
        display(Ans);


    }


}
