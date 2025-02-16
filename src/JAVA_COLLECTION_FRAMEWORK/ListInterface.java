package JAVA_COLLECTION_FRAMEWORK;

import java.util.*;

public class ListInterface {

    static  void ArrayListExamples(){

        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);       // 1 2 3
        System.out.println(l.get(1));   // 2
        l.set(1,10);
        System.out.println(l);      // 1 10 3
        System.out.println(l.contains(10));     //true


    }


    static void stackExample(){

        Stack<String> st=new Stack<>();

        st.push("pw");
        st.push("skills");
        System.out.println(st.peek()); //skills
        System.out.println(st.pop());  //skills (will also remove it)
        System.out.println(st.peek());  //pw
        System.out.println(st.size());  //1
        System.out.println(st.isEmpty());  //false


    }


    static void QueueExample(){

        LinkedList<Integer> q=new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); //1
        System.out.println(q.poll());  // 1-will also remove
        System.out.println(q.peek());  //2
        System.out.println(q.isEmpty());  //false
        System.out.println(q.size());  //2
        System.out.println(q);


    }

    static void priorityQueue(){

       // PriorityQueue<Integer> p=new PriorityQueue<>();   // min priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());   // max priority queue
//        p.add(10);
//        p.add(5);
//        p.add(7);
//        System.out.println(p.peek()); // 5-the smallest element has highest priority queue
//        System.out.println(p);  // Guarantee-topmost priority element will be processed first
//        System.out.println(p.poll()); //5
//        System.out.println(p.peek());//7


        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 10-the highest element has highest priority queue
        System.out.println(pq);  // Guarantee-topmost priority element will be processed first
        System.out.println(pq.poll()); //10
        System.out.println(pq.peek());//7


    }


    static void DequeueExamples(){

        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);  //[2,1]
        dq.addLast(3);
        System.out.println(dq); //[2,1,3]
        dq.addLast(4);
        System.out.println(dq); //[2,1,3,4]
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast());  //4

    }


    public static void main(String[] args) {
        //ArrayListExamples();
       // stackExample();
      //  QueueExample();
       // priorityQueue();
        DequeueExamples();


    }
}
