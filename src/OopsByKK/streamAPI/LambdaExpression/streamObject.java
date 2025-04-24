package OopsByKK.streamAPI.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamObject {

    public static void main(String[] args) {

        // How to create stream object


        // stream API-collection process

        // u can create stream for empty object
        Stream<Object> st=Stream.empty();
        System.out.println(st.count());


        // u can create stream in array,object, collection

        String[] names={"Durgesh","uttam","Ankit","Divya"};
        Stream<String> obj=Stream.of(names);             // internally-->Stream<String> obj=Stream.of("Durgesh","uttam","Ankit","Divya");
        obj.forEach(e-> System.out.print(e+" "));

        System.out.println();

        // using builder u can create stream

        //Stream.Builder is used to add elements to a stream programmatically
        //.build() is used to finalize the stream construction and return a new Stream object containing the elements that were added to the builder.
      Stream<Object> obj2=  Stream.builder().build();
      Stream<Object> abc=  Stream.builder().add("hello").add("world").build();
      abc.forEach(x-> System.out.println(x));

      // using Array.Stream

        //IntStream is a special type of Stream in Java designed to handle only primitive int values.

       IntStream obj3= Arrays.stream(new int[]{10,20,3,4,5});   // internally--> public static IntStream stream(int[] array)
       obj3.forEach(a-> System.out.print(a +" "));

       // java provides

        //Array    Type	Stream Type	        Example
        //int[]	    IntStream	         Arrays.stream(new int[]{...})
        //long[]	LongStream	            Arrays.stream(new long[]{...})
        //double[]	DoubleStream	       Arrays.stream(new double[]{...})
        //Integer[]	Stream<Integer>      	Arrays.stream(new Integer[]{...})
        //String[]	Stream<String>	       Arrays.stream(new String[]{...})

        System.out.println();

       // list set

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);
        list.add(99);

       Stream<Integer> obj4= list.stream();
       obj4.forEach(e-> System.out.print(e+" "));

    }
}
