package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class Q38 {

    public static class Node {


        int data;
        Node prev;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    static ArrayList<ArrayList<Integer>> sumPairs(Node head, int sum){

        //Time Complexity (TC): O(N)
        //Space Complexity (SC): O(1) (excluding the output list)

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        Node temp=head;

        while (temp.next!=null){

            temp=temp.next;

        }


        while (head != null && temp != null && head != temp && temp.next != head){

            int pairSum=head.data + temp.data;

            if(pairSum==sum){

             list.add(new ArrayList<>(Arrays.asList(head.data,temp.data)));
             head=head.next;
             temp=temp.prev;


            }


            else if(head.data + temp.data>sum){
                temp=temp.prev;
            }

            else {
                head=head.next;
            }


        }

        return list;


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

        // Find pairs with given sum in Sorted DLL

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(9);

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

        int sum=5;

        ArrayList<ArrayList<Integer>> Ans=sumPairs(a,sum);
        System.out.println(Ans);






    }
}
