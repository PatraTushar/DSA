package QueueByStriver.basics;

public class implementQueueUsingDeque {

    private dequeImplementationOfArray deque;

    implementQueueUsingDeque(int capacity) {

        deque = new dequeImplementationOfArray(capacity);
    }

    public void offer(int data){

        deque.offerLast(data);
    }


    public Integer poll(){

       return deque.pollFirst();
    }


    public Integer peek(){

        return deque.peekFirst();
    }

    public boolean isEmpty(){

        return deque.isEmpty();
    }

    public int size(){

        return deque.size();
    }

    public void display(){

        deque.display();
    }

    public static void main(String[] args) {


        implementQueueUsingDeque queue=new implementQueueUsingDeque(5);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.display(); // Output: 10 20 30

        System.out.println("Peek: " + queue.peek()); // 10
        System.out.println("Poll: " + queue.poll()); // 10
        queue.display(); // Output: 20 30

        queue.offer(40);
        queue.offer(50);
        queue.display(); // Output: 20 30 40 50

        System.out.println("Poll: " + queue.poll()); // 20
        queue.display(); // Output: 30 40 50

        System.out.println("Is empty? " + queue.isEmpty()); // false
        System.out.println("Size: " + queue.size()); // 3


    }
}
