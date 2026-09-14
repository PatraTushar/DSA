import java.util.ArrayList;
import java.util.Iterator;

public class myThread extends Thread {

    static ArrayList<String> list = new ArrayList<>();

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        System.out.println(" child thread is updating the list ");
        list.add("d");
    }

    public static void main(String[] args) throws InterruptedException {

        list.add("a");
        list.add("b");
        list.add("c");

        myThread t = new myThread();
        t.start();

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {

            String s = itr.next();
            System.out.println(" main thread is iterating the list and the current object is : " + s);
            Thread.sleep(2000);
        }

        System.out.println(list);


    }
}
