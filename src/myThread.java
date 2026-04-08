import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class myThread extends Thread {

    static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println(" child thread is trying to update the list ");
        list.add(100);
    }

    public static void main(String[] args) throws Exception {

        list.add(10);
        list.add(20);
        list.add(30);

        myThread thread = new myThread();
        thread.start();

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {

            System.out.println(" main thread is iterating the list and the current object is "+itr.next());
            Thread.sleep(2000);
        }

        System.out.println(list);

    }
}








