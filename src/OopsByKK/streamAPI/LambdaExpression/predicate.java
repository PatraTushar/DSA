package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {

        // predicate->functional interface (boolean valued function)

        Predicate<Integer> isEven=(x)->x%2==0;
        System.out.println(isEven.test(100));

        Predicate<String> isStartsWithA=(x)->x.startsWith("A");
        System.out.println(isStartsWithA.test("Ashish"));

        Predicate<String> isStartsWithT=(a)->a.startsWith("T");
        Predicate<String> isEndsWithR=(a)->a.endsWith("R");
        Predicate<String> and=isStartsWithT.and(isEndsWithR);
        System.out.println(and.test("TUSHAR"));






    }
}
