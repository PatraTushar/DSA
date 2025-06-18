package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q1 {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static void display(Node a){

        Node temp=a;

        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void deleteNode(Node node){

        //Time Complexity (TC): O(1)
        //Space Complexity (SC): O(1)

        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Cannot delete the last node using this method.");
        }


        node.data=node.next.data;
        node.next=node.next.next;


    }

    public static void main(String[] args) {

        // Q: Delete node with node as given parameter

        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;

        display(a);
        deleteNode(b);
        display(a);





    }
}
