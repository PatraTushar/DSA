package java_Jspider;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class myThread extends Thread {

    static ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        }catch (Exception e){}


        map.put(4,"mehul");

        System.out.println(" child thread is trying to  update the list ");

    }

    public static void main(String[] args) throws Exception {

        map.put(1,"rahul");
        map.put(2,"mohan");
        map.put(3,"shweta");

        myThread t1=new myThread();
        t1.start();

        Set<Integer> key=map.keySet();
        Iterator<Integer> it=key.iterator();

        while (it.hasNext()){

            Integer n=it.next();

            System.out.println(" main thread is iterating the list and want to print the names "+map.get(n));
            Thread.sleep(3000);


        }


        System.out.println(map);


    }


}


