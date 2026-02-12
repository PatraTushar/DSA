package QUEUE.basics;


public class arrayImplementationOfQueue {

    public static class Queue {

        int[] Queue;
        int front;
        int rear;

        int size;

        int capacity;

        int DEFAULT_CAPACITY = 10;


        Queue() {

            capacity = DEFAULT_CAPACITY;
            Queue = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;

        }


        public boolean isEmpty() {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == 0;
        }

        public boolean isFull() {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == capacity;
        }

        public int getSize() {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            return size;
        }


        public void add(int val) {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isFull()) {

                throw new IllegalStateException();
            }

            if (isEmpty()) {

                front = rear = 0;
            }

            Queue[rear++] = val;
            size++;

        }


        public Integer poll() {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                return null;
            }


            int top = Queue[front];
            front++;
            size--;


            return top;


        }

        public Integer peek() {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) return null;

            return Queue[front];
        }


        public void display() {

            // Time Complexity: O(n)
            //Space Complexity: O(1)

            for (int i = front; i < rear; i++) {

                System.out.print(Queue[i] + " ");
            }

            System.out.println();
        }


    }


    public static void main(String[] args) {

        // It is not recommended because of wastage of space instead use circular queue

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.getSize());

    }
}
