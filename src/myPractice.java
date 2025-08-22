import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class myPractice {



    public static void main(String[] args) {

        List<List<String>> listOfLists=Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grapes")
        );

        System.out.println(listOfLists.get(0).get(1));

        System.out.println( listOfLists.stream().flatMap(e->e.stream().map(String::toUpperCase)).toList());



















    }


}











