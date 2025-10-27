import java.util.Deque;

public class myPractice {


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
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);
        dq.offerFirst(40);
        dq.offerFirst(50);
        dq.display();
        dq.offerLast(100);
        dq.offerLast(200);
        dq.offerLast(300);
        dq.offerLast(400);
        dq.offerLast(500);
        dq.display();
        System.out.println(dq.isEmpty());
        System.out.println(dq.isFull());
        System.out.println(dq.getSize());
        System.out.println(dq.pollFirst());
        dq.display();
        System.out.println(dq.pollLast());
        dq.display();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


    }

}

