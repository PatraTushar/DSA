package QueueByStriver.basics;

import java.util.NoSuchElementException;

public class ImplementationQueueUsingArrays {

    int front=-1;
    int rear=-1;
    int size=0;

    int[] Queue=new int[10];

    public void add(int val){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        if (size==Queue.length){
            throw new NoSuchElementException(" Queue is full we cant insert anything ");
        }

        if (front==-1 && rear==-1) {
            front=0;
            rear=0;

        }

        else {
            rear=(rear+1) % Queue.length;
        }
        Queue[rear]=val;
        size++;


    }

    public int peek(){

         // Time Complexity: O(1)
        // Space Complexity: O(1)

        if(size==0){
            throw new NoSuchElementException(" cant peek anything queue is empty ");
        }

        return Queue[front];
    }

    public int remove(){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        if(size==0){
            throw new NoSuchElementException(" cant delete anything as the queue is empty ");
        }

        int val=Queue[front];
        if(size==1){
            front=rear=-1;
        }

        else {

            front=(front+1)% Queue.length;


        }

        size--;

        return val;




    }

    public int size(){

        // Time Complexity: O(1)
        //Space Complexity: O(1)

        return size;
    }










    public static void main(String[] args) {

        ImplementationQueueUsingArrays queue=new ImplementationQueueUsingArrays();



    }
}
