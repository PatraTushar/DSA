package HASHSET;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();

        // insert

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);


        //search - contains

        if(set.contains(1)){
            System.out.println(" set contains 1 ");
        }

        if(!set.contains(6)){

            System.out.println(" does not contain ");
        }


        //Delete

        set.remove(1);

        if(!set.contains(1)){

            System.out.println(" does not contain 1- we deleted 1 ");
        }

        //Size

        System.out.println(" size of set is " +set.size());


        //iterator

        Iterator i=set.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }





    }
}
