package java_Jspider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class myThread extends Thread {

    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();


    @Override
    public void run() {


        try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }


        System.out.println(" iterating the child thread and try to modify the collection object ");
        list.add("D");


    }

    public static void main(String[] args) throws Exception {


        list.add("A");
        list.add("B");
        list.add("C");

        myThread t = new myThread();
        t.start();

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {

            String character = it.next();
            System.out.println(" iterating the main thread and the object is " + character);
            Thread.sleep(2000);
        }

        System.out.println(list);


    }
}
