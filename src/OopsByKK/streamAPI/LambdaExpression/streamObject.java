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

        // u can create stream in array,object, collection

        String[] names={"Durgesh","uttam","Ankit","Divya"};
        Stream<String> obj=Stream.of(names);
        obj.forEach(e-> System.out.print(e+" "));

        System.out.println();

        // using builder u can create stream

      Stream<Object> obj2=  Stream.builder().build();

      // using Array.Stream

       IntStream obj3= Arrays.stream(new int[]{10,20,3,4,5});
       obj3.forEach(a-> System.out.print(a +" "));

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
