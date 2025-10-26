package QueueByStriver.basics;

public class arrayImplementationOfCQ {

    public static class circularQueue {

        int[] Queue;
        int front;
        int rear;

        int size;

        int capacity;

        int DEFAULT_CAPACITY = 10;


        circularQueue() {

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

            rear = (rear + 1) % capacity;
            Queue[rear] = val;

            if (front == -1) front = 0;

            size++;


        }


        public Integer poll() {

            // Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                return null;
            }


            int top = Queue[front];
            front = (front + 1) % capacity;
            size--;

            if (size == 0) {

                front = rear = -1;
            }

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

            if (front <= rear) {

                for (int i = front; i <= rear; i++) {

                    System.out.print(Queue[i] + " ");

                }


            } else {


                for (int i = front; i < capacity; i++) {

                    System.out.print(Queue[i] + " ");
                }

                for (int i = 0; i <= rear; i++) {

                    System.out.print(Queue[i] + " ");
                }

            }

        }


    }


    public static void main(String[] args) {

        circularQueue q = new circularQueue();
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
