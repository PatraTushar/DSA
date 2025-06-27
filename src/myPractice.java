import java.util.EmptyStackException;
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
    Node tail=null;

    int size=0;


    public void add(int data){

        Node newNode=new Node(data);

        if(size==0){
            head=newNode;

        }
        else {
            tail.next=newNode;

        }
        tail=newNode;
        size++;
    }

    public int remove(){

        if(size==0){
            throw new NoSuchElementException(" queue is empty ");
        }

        int top= head.data;
        head=head.next;
        size--;
        if(size==0) tail=null;
        return top ;
    }

    public int peek(){

        if(size==0){
            throw new NoSuchElementException(" queue is empty ");
        }

        return head.data;


    }


    public int getSize(){

        if(size==0) return 0;

        return size;
    }

    public boolean isEmpty(){

        if(size==0) return true;
        return false;
    }



    public static void main(String[] args) {


    }


}