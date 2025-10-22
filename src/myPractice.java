import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class myPractice {



    public static void main(String[] args) {

        Deque<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        q.offerFirst(344);
        System.out.println(q);






    }
}

