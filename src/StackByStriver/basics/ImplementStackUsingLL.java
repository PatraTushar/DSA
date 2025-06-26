package StackByStriver.basics;

import java.util.NoSuchElementException;

public class ImplementStackUsingLL {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }


    }


    Node head = null;
    int size = 0;


    public void push(int data){

          // Time Complexity: O(1)
        // Space Complexity: O(1)

        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public int pop(){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        if(head==null){
            throw new NoSuchElementException(" Nothing to delete Linked List is empty ");
        }

        int top=head.data;
        head=head.next;
        size--;

        return top;

    }

    public int peek(){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        if(head==null){
            throw new NoSuchElementException(" Nothing to peek Linked List is empty ");
        }

        return head.data;


    }

    int size(){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        return size;
    }


    boolean isEmpty(){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        if(size==0){
            return true;
        }

        else return false;
    }

     void display(){

         // Time Complexity: O(n)
         //Space Complexity: O(1)

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.println();
    }


    public static void main(String[] args) {

        ImplementStackUsingLL st=new ImplementStackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display(); // 50 40 30 20 10
        st.pop();
        st.display(); // 40 30 20 10
        System.out.println(st.size()); // 4
        System.out.println(st.peek()); // 40
        System.out.println(st.isEmpty()); // false






    }
}
