package QueueByStriver.basics;

public class dequeImplementationOfArray {

    private int[] arr;
    private int front;
    private int rear;

    private int size;
    private int capacity;


    public dequeImplementationOfArray(int capacity) {

        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == capacity;
    }


    public int size() {

        return size;
    }


    public void offerFirst(int data) {

        if (isFull()) {

            System.out.println(" Deque is full ");
            return;
        }

        if (isEmpty()) {

            front = rear = 0;
        } else {

            front = (front - 1 + capacity) % capacity;


        }

        arr[front] = data;
        size++;


    }


    public void offerLast(int data) {

        if (isFull()) {

            System.out.println(" Deque is full ");
            return;
        }

        if (isEmpty()) {

            front = rear = 0;
        } else {

            rear = (rear + 1) % capacity;

        }

        arr[rear] = data;
        size++;
    }


    public Integer pollFirst() {

        if (isEmpty()) return null;

        int val = arr[front];

        front = (front + 1) % capacity;
        size--;

        if (size == 0) {

            front = rear = -1;
        }

        return val;
    }

    public Integer pollLast() {

        if (isEmpty()) return null;

        int val = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;

        if (size == 0) {

            front = rear = -1;
        }

        return val;
    }


    public Integer peekFirst() {

        if (isEmpty()) return null;
        return arr[front];
    }


    public Integer peekLast() {

        if (isEmpty()) return null;

        return arr[rear];
    }


    public void display(){

        if (isEmpty()){

            System.out.println(" Deque is empty ");
            return;
        }

        int i=front;

        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity; // move circularly
        }
        System.out.println();
    }


    public static void main(String[] args) {

        dequeImplementationOfArray dq=new dequeImplementationOfArray(5);


        // Add elements to front and rear
        dq.offerLast(10);  // Deque: 10
        dq.offerFirst(5);  // Deque: 5 10
        dq.offerLast(20);  // Deque: 5 10 20
        dq.offerFirst(2);  // Deque: 2 5 10 20

        // Display deque
        System.out.print("Deque elements: ");
        dq.display();    // Output: 2 5 10 20

        // Peek front and rear
        System.out.println("Front element: " + dq.peekFirst()); // 2
        System.out.println("Rear element: " + dq.peekLast());   // 20

        // Remove elements from front and rear
        System.out.println("Removed front: " + dq.pollFirst()); // removes 2
        System.out.println("Removed rear: " + dq.pollLast());   // removes 20

        // Display deque after removals
        System.out.print("Deque after removals: ");
        dq.display();     // Output: 5 10

        // Size and empty check
        System.out.println("Deque size: " + dq.size());          // 2
        System.out.println("Is deque empty? " + dq.isEmpty());   // false

        // Add more elements to test circular behavior
        dq.offerLast(30);  // 5 10 30
        dq.offerLast(40);  // 5 10 30 40
        dq.offerFirst(1);  // 1 5 10 30 40

        System.out.print("Deque after more additions: ");
        dq.display();    // Output: 1 5 10 30 40


    }
}
