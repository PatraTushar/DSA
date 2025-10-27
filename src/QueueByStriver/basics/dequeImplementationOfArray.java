package QueueByStriver.basics;




public  class dequeImplementationOfArray {

    public static class DEQUE {

        int[] Deque;
        int front;
        int rear;

        int capacity;

        int size;

        int DEFAULT_CAPACITY = 10;

        DEQUE() {

            capacity = DEFAULT_CAPACITY;
            Deque = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() {


            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == 0;
        }


        public boolean isFull() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == capacity;
        }

        public int getSize() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size;
        }

        public void resize() {

            //Time Complexity: O(n)
            //Space Complexity: O(n)

            capacity *= 2;
            int[] newDeque = new int[capacity];

            for (int i = 0; i < size; i++) {


                // Calculate current index in the old circular array
                int oldIndex = (front + i) % (capacity / 2);
                // Copy to the start of the new array
                newDeque[i] = Deque[oldIndex];

            }

            Deque = newDeque;

            front = 0;
            rear = size - 1;


        }


        public void offerFirst(int val) {

            //Time Complexity: O(1)
            //Space Complexity: O(1)


            if (isFull()) {

                System.out.println(" deque is full ");
                return;
            }

            if (isEmpty()) {

                front = rear = 0;

            } else {

                front = (front - 1 + capacity) % capacity;


            }

            Deque[front] = val;
            size++;

            if (size == capacity) resize();


        }

        public void offerLast(int val) {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isFull()) {

                System.out.println(" deque is full return ");
                return;
            }

            if (isEmpty()) {

                front = rear = 0;
            } else {

                rear = (rear + 1) % capacity;
            }

            Deque[rear] = val;
            size++;

            if (size == capacity) resize();
        }


        public void shrink() {


            //Time Complexity: O(n)
            //Space Complexity: O(n)

            capacity /= 2;

            int[] newDeque = new int[capacity];

            for (int i = 0; i < size; i++) {


                // Calculate current index in the old circular array
                int oldIndex = (front + i) % (capacity * 2);
                // Copy to the start of the new array
                newDeque[i] = Deque[oldIndex];

            }

            Deque = newDeque;

            front = 0;
            rear = size - 1;

        }


        public Integer pollFirst() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                return null;
            }

            int top = Deque[front];

            front = (front + 1) % capacity;
            size--;

            if (size == 0) front = rear = -1;

            if (capacity > DEFAULT_CAPACITY && size < capacity / 4) shrink();

            return top;
        }


        public Integer pollLast() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                return null;
            }

            int top = Deque[rear];

            rear = (rear - 1 + capacity) % capacity;
            size--;

            if (size == 0) front = rear = -1;

            if (capacity > DEFAULT_CAPACITY && size < capacity / 4) shrink();

            return top;
        }


        public Integer peekFirst() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) return null;

            return Deque[front];
        }

        public Integer peekLast() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) return null;

            return Deque[rear];


        }

        public void display() {

            //Time Complexity: O(n)
            //Space Complexity: O(1)

            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.print(Deque[index] + " ");
            }

            System.out.println();

        }


    }


    public static void main(String[] args) {

        DEQUE dq = new DEQUE();

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
