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

    static Node findKthNode(Node head,int k){

        Node temp=head;


        for(int i=1;i<k;i++){

            if(temp==null) return null;


            temp=temp.next;


        }

        return temp;
    }

    static Node reverseByKGroups(Node head, int k) {

       Node temp=head;
       Node prevNode=null;


       while (temp!=null){

           Node kthNode=findKthNode(temp,k);

           if(kthNode==null){

               if(prevNode!=null){
                   prevNode.next=temp;
               }

               break;
           }

           Node newNode=kthNode.next;
           kthNode.next=null;


           reverse(temp);

           if(temp==head){
               head=kthNode;
           }

           else {

               prevNode.next=kthNode;

           }

           prevNode=temp;
           temp=newNode;
       }

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

        int k=3;

        display(a);
        Node Ans = reverseByKGroups(a,k);
        display(Ans);


    }

}