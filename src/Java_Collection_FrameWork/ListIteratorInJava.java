package Java_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInJava {

    public static void main(String[] args) {

        // EXAMPLE 1

        List<Integer> list1=List.of(1,2,3,4);


        // Since we never moved the cursor forward, hasPrevious() returns false and the loop doesn't execute.

        ListIterator<Integer> itr=list1.listIterator();
        while (itr.hasPrevious()){
            Integer ans=itr.previous();
            System.out.println(ans);
        }


        // EXAMPLE 2

        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");


        System.out.println(list);


        ListIterator<String> obj=list.listIterator();      //  ListIterator<String> obj-> obj is a reference to an object that will iterate over a collection of type String.
        while (obj.hasNext()){

            String language=obj.next();
            System.out.println(language);
        }

        System.out.println();

        //  Now obj.hasPrevious() will return true because the cursor is at the end after the previous loop.
        // So we can go backward and print elements in reverse.

        while (obj.hasPrevious()){

            String language=obj.previous();
            System.out.println(language);
        }









    }
}
