import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class myThread extends Thread {

    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {

        try {

            Thread.sleep(2000);

        } catch (Exception e) {

        }

        System.out.println(" child thread is updating the list ");
        list.add("d");
    }

    public static void main(String[] args) throws Exception {

        list.add("a");
        list.add("b");
        list.add("c");

        myThread t = new myThread();
        t.start();

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {

            String name= itr.next();

            System.out.println(" main thread is iterating the list and the object is "+name);
            Thread.sleep(3000);
        }


        System.out.println(list);


    }


}
