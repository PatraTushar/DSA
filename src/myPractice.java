import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class myPractice {



    public static void main(String[] args) {


        String[] array={"a","b","c"};
      Arrays.stream(array).forEach( System.out::println);


       List<Double> list= Stream.generate(Math::random).limit(10).collect(Collectors.toList());
        System.out.println(list);




    }


}











