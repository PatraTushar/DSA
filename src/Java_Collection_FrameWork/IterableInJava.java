package Java_Collection_FrameWork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableInJava {

    // custom class implementing iterable

    public static class myClassCollection implements Iterable<String>{

        // Iterable<String>-> “I am a class that can be traversed, and I will return an Iterator of type String, i.e., something that returns String objects one by one.”
        private List<String> data= Arrays.asList("Rahul","Raj","Rohan","Ram");


        @Override
        public Iterator<String > iterator() {
            return data.iterator();
        }
    }

    public static void main(String[] args) {

        myClassCollection obj=new myClassCollection();

        for(String s: obj){

            System.out.println(s);

        }


    }
}
