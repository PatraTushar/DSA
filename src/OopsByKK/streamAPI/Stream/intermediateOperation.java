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


        List<String> names=List.of("Akash","rajiv","Aman","Rohit","Rahul");
        names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);

        //2. map

        Stream<String > stringStream=list.stream().map(x->x.toUpperCase());
        System.out.println(stringStream.collect(Collectors.toList()));


        names.stream().map(String::toUpperCase).forEach(System.out::println);


        // 3 .sorted

        List<Integer> number=List.of(45,19,32,79,1);
        List<Integer> sort=number.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        System.out.println(number.stream().sorted().collect(Collectors.toList()));


        Stream<String> sortedStreamUsingComparator=list.stream().sorted((a,b)->a.length()-b.length());

        //4. distinct

        System.out.println(list.stream().filter(e->e.startsWith("A")).count());
        System.out.println(list.stream().filter(e->e.startsWith("A")).distinct().count());

        List<Integer> num=List.of(45,10,32,10,5,10);
        List<Integer> noDuplicateList= num.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplicateList);

        System.out.println(num.stream().distinct().collect(Collectors.toList()));

        // 5.limit
        System.out.println(  Stream.iterate(1,i->i+1).limit(100).count());
        List<Integer> ele=Stream.iterate(1,e->e+1).limit(20).collect(Collectors.toList());
        System.out.println(ele);
        List<Double> d= Stream.generate(Math::random).limit(10).collect(Collectors.toList());
        System.out.println(d);
        System.out.println(Stream.generate(Math::random).limit(10).collect(Collectors.toList()));
        System.out.println(Stream.iterate(1,e->e+1).limit(20).collect(Collectors.toList()));

        //6.skip

        List<Integer> s=Stream.iterate(1,e->e+1).limit(100).skip(10).collect(Collectors.toList());
        System.out.println(s);
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());
        System.out.println();

        //7.peek()

        long count= Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();
        System.out.println(" Total elements in the stream are " +count);


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

        List<String> allFruits=listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(allFruits);

        List<String> allFruits1=listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(allFruits1);

        List<String> sentences=Arrays.asList(
                "Hello world ",
                "java Streams are powerful",
                "flatmap is useful"
        );

        System.out.println(sentences
                .stream()
                .flatMap(e->Arrays.stream(e.split(" ")))
                .map(String::toUpperCase).toList());



        // Only a stored stream variable cannot be reused after a terminal operation; new streams from the source are always safe.

//        Stream<String> names=Stream.of("Akash","rajiv","Aman","Rohit","Rahul");
//        names.filter(e->e.startsWith("A")).forEach(System.out::println);
//
//        names.filter(e->e.endsWith("h")).forEach(System.out::println);














    }
}
