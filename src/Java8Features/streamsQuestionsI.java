package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamsQuestionsI {

    public static void main(String[] args) {

        // HOW DO YOU CREATE STREAMS IN JAVA

        //  1) List->Stream
        List<String> names = Arrays.asList("alice", "bob");
        Stream<String> stream = names.stream();

        // 2) Arrays->Stream
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> stream1 = Arrays.stream(arr);

        // 3) By Using Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        //  4) By Using Stream.generate()
        Stream<Double> generate = Stream.generate(Math::random).limit(5);

    }
}
