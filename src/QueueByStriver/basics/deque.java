package QueueByStriver.basics;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class deque {

    public static void main(String[] args) {

        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addFirst(40);
        dq.addFirst(50);
        System.out.println(dq);  // [50, 40, 30, 20, 10]
        dq.addLast(100);
        dq.addLast(200);
        dq.addLast(300);
        dq.addLast(400);
        dq.addLast(500);
        System.out.println(dq); // [50, 40, 30, 20, 10, 100, 200, 300, 400, 500]
        dq.offerFirst(333);
        System.out.println(dq); // [333, 50, 40, 30, 20, 10, 100, 200, 300, 400, 500]
        dq.offerLast(4101);
        System.out.println(dq); // [333, 50, 40, 30, 20, 10, 100, 200, 300, 400, 500, 4101]
        dq.removeFirst();
        System.out.println(dq); // [50, 40, 30, 20, 10, 100, 200, 300, 400, 500, 4101]
        dq.removeLast();
        System.out.println(dq); // [50, 40, 30, 20, 10, 100, 200, 300, 400, 500]
        dq.pollFirst();
        System.out.println(dq); // [ 40, 30, 20, 10, 100, 200, 300, 400, 500]
        dq.pollLast();
        System.out.println(dq); // [40, 30, 20, 10, 100, 200, 300, 400]
        System.out.println(dq.peekFirst()); // 4
        System.out.println(dq.peekLast()); // 400
        System.out.println(dq.getFirst()); // 4
        System.out.println(dq.getLast());  // 400
        dq.push(111);
        System.out.println(dq); // [111, 40, 30, 20, 10, 100, 200, 300, 400]
        dq.pop();
        System.out.println(dq); // [ 40, 30, 20, 10, 100, 200, 300, 400]
        System.out.println(dq.peek()); // 40
        dq.add(2121);
        System.out.println(dq); // [40, 30, 20, 10, 100, 200, 300, 400, 2121]
        dq.offer(333);
        System.out.println(dq); // [40, 30, 20, 10, 100, 200, 300, 400, 2121,333]
        dq.remove();
        System.out.println(dq); // [ 30, 20, 10, 100, 200, 300, 400, 2121,333]
        dq.poll();
        System.out.println(dq); // [ 20, 10, 100, 200, 300, 400, 2121,333]
        System.out.println(dq.peek()); // 20
        System.out.println(dq.element()); // 20
        System.out.println(dq.size()); // 8
        System.out.println(dq.isEmpty()); //false
       // dq.clear(); // Remove all elements
        System.out.println(dq.contains(3)); //false
        System.out.println(dq.contains(300)); //true


     //🔹 hasNext() assumes there is a next element only if one actually exists.
        //🔹 It checks ahead — it does not assume blindly.
        //🔹 If there's even one more element, it returns true.
        //🔹 If you're already past the last element, it returns false.

        //it.next()
        //Returns the current element the iterator is pointing to.
        //Then moves the iterator to the next element.

        Iterator<Integer> it=dq.iterator();
        while (it.hasNext()){
            int value=it.next();
            System.out.print(value +" ");   // 20 10 100 200 300 400 2121 333
        }

        System.out.println();

        Iterator<Integer> ite=dq.descendingIterator();
        while (ite.hasNext()){
            int value= ite.next();
            System.out.print(value +" "); // 333 2121 400 300 200 100 10 20
        }










    }
}
