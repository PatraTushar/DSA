package OopsByKK.streamAPI.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class intermediateOperation {

    public static void main(String[] args) {

        // intermediate operations transform a stream into another stream
        // They are lazy,meaning they dont execute until a terminal operation is invoked

        // 1. filter

        List<String> list= Arrays.asList("Akshit","Ram","Shyam","Ghanshyam","Akshit");
        Stream<String> filterStream=list.stream().filter(e->e.startsWith("A"));
        System.out.println(filterStream.collect(Collectors.toList()));

        long res=list.stream().filter(e->e.startsWith("A")).count();
        System.out.println(res);

        //2. map

        Stream<String > stringStream=list.stream().map(x->x.toUpperCase());
        System.out.println(stringStream.collect(Collectors.toList()));


        // 3 .sorted

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        Stream<String> sortedStreamUsingComparator=list.stream().sorted((a,b)->a.length()-b.length());

        //4. distinct

        System.out.println(list.stream().filter(e->e.startsWith("A")).count());
        System.out.println(list.stream().filter(e->e.startsWith("A")).distinct().count());

        // 5.limit


        System.out.println(  Stream.iterate(1,i->i+1).limit(100).count());

        //6.skip

        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());
        System.out.println();

        //7.peek()
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

        // flatMap
        //Handle streams of collections ,lists or arrays where each element is itself a collection
        //Flatten nested structure(eg lists within list)so that they can be processed as single sequence of elements
        //Transform and flatten elements at the same time

        List<List<String>> listOfLists=Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grapes")
        );

        System.out.println(listOfLists.get(0).get(1));

        System.out.println( listOfLists.stream().flatMap(e->e.stream().map(String::toUpperCase)).toList());

        List<String> sentences=Arrays.asList(
                "Hello world ",
                "java Streams are powerful",
                "flatmap is useful"
        );

        System.out.println(sentences
                .stream()
                .flatMap(e->Arrays.stream(e.split(" ")))
                .map(String::toUpperCase).toList());














    }
}
