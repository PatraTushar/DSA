import java.util.NoSuchElementException;
import java.util.Queue;

public class myPractice {

    public static class Queue {

        int[] Queue = new int[5];
        int front = -1;
        int rear = -1;

        int size = 0;


        public void add(int data){

            if(size==Queue.length){
                System.out.println(" queue is full ");
                return;
            }

            if(front==-1){
                front=0;
                rear=0;
            }


            Queue[rear]=data;
            rear=(rear+1) % Queue.length;
            size++;




        }


        public int remove(){

            if(front==-1){
                throw new NoSuchElementException(" queue is empty ");
            }


            int val=Queue[front];
            front=(front+1)%Queue.length;
            size--;
            if(size==0) front=rear=-1;

            return val;
        }

        public int peek(){

            if(front==-1){
                throw new NoSuchElementException(" queue is empty ");
            }

            return Queue[front];
        }

        int getSize(){

            if(size==0) return 0;
            return size;
        }

        public boolean isEmpty(){

            return size==0;
        }

        public void display(){

            if(front==-1){
                throw new NoSuchElementException(" queue is empty ");
            }

            if(rear>=front){

                for(int i=front;i<rear;i++){
                    System.out.print(Queue[i] +" ");
                }
            }


            else {

                for(int i=front;i< Queue.length;i++){
                    System.out.print(Queue[i]+" ");
                }

                for(int i=0;i<rear;i++){
                    System.out.print(Queue[i] +" ");

                }
            }




        }




    }

    public static void main(String[] args) {

    }

}