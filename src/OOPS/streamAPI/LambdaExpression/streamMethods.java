package OOPS.streamAPI.LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;

public class streamMethods {
    public static void main(String[] args) {

        // filter(predicate)      predicate->boolean valued function

        List<String> names= List.of("Ankit" , "Aman","Rahul","Ashutosh");
       List<String > obj= names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(obj);

        // map(function)

        List<Integer> number=List.of(2,4,1,10,5);
       List<Integer> square= number.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(square);

       // number.stream().forEach(e-> System.out.print(e*e+" "));


        // sorted

        number.stream().sorted().forEach(e-> System.out.print(e +" "));

        System.out.println();


        //min

       Integer min= number.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(min);


        //max

        Integer max=  number.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);



    }
}
