package OOPS.streamAPI.LambdaExpression.MethodReference.InstancMethodreference;


import java.util.Arrays;
import java.util.List;

public class instanceMethodReference {

    public static void main(String[] args) {

        //An instance method reference is written as:
        //objectName::methodName
        //objectName::methodName--->objectName.methodName

        // Example 1: Imagine you have a list of strings and you want to print each string.
        List<String> names= Arrays.asList("Alice","Bob","Charlie");

        //Lambda Expression
        names.forEach(e-> System.out.println(e));

        // Method Reference
        names.forEach(System.out::println);









    }
}
