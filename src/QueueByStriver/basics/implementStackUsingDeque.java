package QueueByStriver.basics;

public class implementStackUsingDeque {

    private dequeImplementationOfArray deque;

    implementStackUsingDeque(int capacity) {

        deque = new dequeImplementationOfArray(capacity);
    }


    public void push(int val) {

        deque.offerLast(val);
    }

    public Integer pop() {

        return deque.pollLast();
    }

    public Integer peek() {

        return deque.peekLast();
    }

    public boolean isEmpty() {

        return deque.isEmpty();
    }

    public int size() {

        return deque.size();
    }


    public void display() {

        deque.display();
    }

    public static void main(String[] args) {

        implementStackUsingDeque stack = new implementStackUsingDeque(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // 10 20 30

        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        stack.display(); // 10 20

        stack.push(40);
        stack.display(); // 10 20 40

        System.out.println("Pop: " + stack.pop()); // 40
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Pop: " + stack.pop()); // 10
        System.out.println("Pop: " + stack.pop()); // null
        System.out.println("Is stack empty? " + stack.isEmpty()); // true


    }
}
