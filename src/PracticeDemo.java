import java.util.LinkedList;

public class PracticeDemo {

    public static void main(String[] args) {

        LinkedList l=new LinkedList();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.add("durga");
        l.set(0,"sofware");
        l.set(0,"venky");
        l.removeLast();
        l.addFirst("ccc");
        System.out.println(l);
    }
}
