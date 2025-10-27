import QueueByStriver.basics.dequeImplementationOfArray;

public class myPractice {

    public static class dequeImplementationOfArray {


        int[] deque;
        int front;
        int rear;
        int size;
        int capacity;
        int DEFAULT_CAPACITY = 10;

        dequeImplementationOfArray() {

            capacity = DEFAULT_CAPACITY;
            deque = new int[capacity];
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


        public int getSize() {

            return size;
        }

        public void resize() {

            capacity *= 2;

            int[] newDeque = new int[capacity];

            for (int i = 0; i < size; i++) {

                int oldIndex = (front + i) % (capacity / 2);

                newDeque[i] = deque[oldIndex];

            }

            deque = newDeque;

            front = 0;
            rear = size - 1;

        }

        public void offerFirst(int val) {

            if (isFull()) resize();

            if (isEmpty()) {

                front = rear = 0;
            } else {

                front = (front - 1 + capacity) % capacity;


            }

            deque[front] = val;
            size++;


        }


        public void offerLast(int val) {

            if (isFull()) resize();

            if (isEmpty()) {

                front = rear = 0;
            } else {

                rear = (rear + 1) % capacity;

            }

            deque[rear] = val;
            size++;


        }

        public void shrink() {

            capacity /= 2;

            int[] newDeque = new int[capacity];

            for (int i = 0; i < size; i++) {

                int oldIndex = (front + i) % (capacity * 2);
                newDeque[i] = deque[oldIndex];
            }

            deque = newDeque;

            front = 0;
            rear = size - 1;

        }

        public Integer pollFirst() {

            if (isEmpty()) return null;

            int top = deque[front];

            front = (front + 1) % capacity;
            size--;

            if (size == 0) front = rear = -1;

            if (capacity > DEFAULT_CAPACITY && size < capacity / 4) shrink();

            return top;
        }


        public Integer pollLast() {

            if (isEmpty()) return null;

            int top = deque[rear];

            rear = (rear - 1 + capacity) % capacity;
            size--;

            if (size == 0) front = rear = -1;

            if (capacity > DEFAULT_CAPACITY && size < capacity / 4) shrink();

            return top;
        }


        public Integer peekFirst() {

            if (isEmpty()) return null;

            return deque[front];
        }

        public Integer peekLast() {

            if (isEmpty()) return null;

            return deque[rear];
        }


        public void display() {

            for (int i = 0; i < size; i++) {

                int index = (front + i) % capacity;
                System.out.print(deque[index] + " ");

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        dequeImplementationOfArray dq = new dequeImplementationOfArray();

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
        System.out.println("Deque size: " + dq.getSize());          // 2
        System.out.println("Is deque empty? " + dq.isEmpty());   // false

        // Add more elements to test circular behavior
        dq.offerLast(30);  // 5 10 30
        dq.offerLast(40);  // 5 10 30 40
        dq.offerFirst(1);  // 1 5 10 30 40

        System.out.print("Deque after more additions: ");
        dq.display();    // Output: 1 5 10 30 40


    }

}

