import java.util.NoSuchElementException;

public class myPractice {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    Node head = null;
    Node tail = null;

    int size=0;


    public void add(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
        }

        else {

            tail.next=newNode;
            tail=newNode;
            tail.next=head;

        }

        size++;


    }

    public int remove(){

        if(size==0){
            throw new NoSuchElementException(" queue is empty ");
        }

        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val=head.data;
        head=head.next;
        tail.next=head;
        size--;

        return val;


    }


    public int peek(){

        if(size==0){
            throw new NoSuchElementException(" queue is empty ");

        }

        return head.data;
    }

    public int size(){

        if(size==0) return 0;

        return size;
    }

    public boolean isEmpty(){

       return size==0;
    }


    public void display(){

        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print(head.data +" ");
        Node temp=head.next;
        while (temp!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();




    }


    public static void main(String[] args) {

    }

}