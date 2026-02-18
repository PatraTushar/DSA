package Java_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentCollection {
}

class myThread extends Thread {

    static ArrayList<String> l=new ArrayList<>();

    @Override
    public void run() {
      try {
          Thread.sleep(2000);
      }catch (InterruptedException e){}

        System.out.println(" child thread updating list ");
      l.add("D");
    }

    public static void main(String[] args) throws InterruptedException {

        l.add("A");
        l.add("B");
        l.add("C");

        myThread t=new myThread();
        t.start();

        Iterator<String> itr=l.iterator();

        while (itr.hasNext()){

            String s= itr.next();

            System.out.println(" main thread iterating list and current object is :"+s);
            Thread.sleep(3000);
        }

        System.out.println(l);
    }
}
