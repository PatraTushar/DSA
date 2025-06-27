package linkedListByStriver.SinglyLinkedList.InterviewQuestion;

public class Q37 {

    public static class Node{

        Node prev;
        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    static Node deleteKeys(Node head,int key){

        //Time Complexity (TC): O(N)
        //Space Complexity (SC): O(1)

        Node temp=head;

        while (temp!=null){

            if(temp.data==key){

                if(temp==head){
                    head=head.next;
                    if (head != null) head.prev = null;
                }

                Node nextNode=temp.next;
                Node prevNode=temp.prev;

                if(nextNode!=null) nextNode.prev=prevNode;
                if(prevNode!=null) prevNode.next=nextNode;

                temp=nextNode;
            }

            else {

                temp=temp.next;
            }
        }

        return head;

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

        // Delete All occurrences of key in DLL

        Node a=new Node(10);
        Node b=new Node(4);
        Node c=new Node(10);
        Node d=new Node(10);
        Node e=new Node(6);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        display(a);
        int key=10;
        Node Ans=deleteKeys(a,key);
        display(Ans);







    }
}
