import java.util.NoSuchElementException;

public class myPractice {

    public static class Queue{


        public static class Node{

            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }


        Node head=null;
        Node tail=null;
        int size=0;


        public void add(int data){

            Node newNode=new Node(data);

            if(head==null){

                head=tail=newNode;

            }

            else {

                tail.next=newNode;
                tail=newNode;

            }

            tail.next=head;
            size++;
        }


        public int remove(){

            if(head==null){
                throw new NoSuchElementException(" queue is empty ");
            }


            int val=head.data;

            if(head==tail){

                head=tail=null;
            }

            else {

                head=head.next;
                tail.next=head;


            }

            size--;
            return val;


        }


        public int peek(){

            if(head==null){
                throw new NoSuchElementException(" queue is empty ");
            }

            return head.data;


        }

        public boolean isEmpty(){

            return size==0;
        }

        public int size(){

            if(size==0) return 0;

            return size;
        }


        public void display(){


            if(head==null){
                throw new NoSuchElementException(" queue is empty ");
            }

            Node temp=head;

            do {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }while (temp!=head);

            System.out.println();
        }
    }

    public static void main(String[] args) {



    }


}