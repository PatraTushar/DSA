package Java8Features.DilipSir.FunctionalInterface.Predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {


        List<String> names=List.of("rahul","shweta","mohan","virat");
        Consumer<String> convertToUpperCase=str-> System.out.println(str.toUpperCase());
        names.forEach(convertToUpperCase);


        List<String> newValue=new ArrayList<>();
        Consumer<String> addToList=str->newValue.add(str);
        names.forEach(addToList);
        System.out.println(newValue);



    }
}
