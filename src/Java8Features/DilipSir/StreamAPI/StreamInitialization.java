package Java8Features.DilipSir.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitialization {

    public static void main(String[] args) {

        // From Collection Object
        List<String> values = List.of("one", "two", "three");
        Stream<String> stream1 = values.stream();

        // Arrays Of Values
        String[] names = {"four", "five", "six"};
        Stream<String> stream2 = Arrays.stream(names);

        // Stream Methods
        Stream<String> stream3 = Stream.of("seven", "eight", "nine");

        //generate()
        Stream<String> stream4 = Stream.generate(() -> "ten");

        // builder()
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> stream5 = streamBuilder.add("eleven").add("twelve").add("thirteen").build();


        // Empty Stream
        Stream<String> stream6 = Stream.empty();

    }
}
