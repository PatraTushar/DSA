package QUEUE;

public class arrayImplementationOfCQ {

    public static class aIQ{

        int front=-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[5];
        int n=arr.length;

        public void add(int x) throws Exception{

            if(size==0){
                front=rear=0;
                arr[0]=x;

            }

            else if(size==n){
                throw new Exception(" queue is full ");

            }

            else if(rear<n-1){
                arr[++rear]=x;

            }

            else if(rear==n-1){
                rear=0;
                arr[0]=x;
            }

            size++;


        }

        public int remove() throws Exception{
            if(size==0){

                throw new Exception(" Queue is empty ");

            }

            else if(front==n-1){

                int val=arr[front];
                front=0;
                size--;
                return val;

            }

            int val=arr[front];
            front++;
            size--;
            return val;

        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }

            else return arr[front];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        public void display(){

            if(size==0){
                System.out.println("Queue is empty");
                return;
                }


            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i] +" ");
                }


            }

            else{  //rear<front

                for(int i=front;i<n;i++){
                    System.out.print(arr[i] +" ");
                }

                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i] +" ");
                }

            }

            System.out.println();




        }
    }

    public static void main(String[] args) throws Exception {

        aIQ q=new aIQ();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); //1 2 3 4
        q.remove();
        q.display(); //2 3 4
        q.add(5);
        q.display(); //2 3 4 5
        q.add(6);
        q.display(); // 2 3 4 5 6

        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i] +" ");              //6 2 3 4 5
        }
    }
}
