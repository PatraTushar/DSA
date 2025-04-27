package OopsByKK.streamAPI.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class User{

    String username;
    int age;

    User(String username,int age){
        this.username=username;
        this.age=age;
    }
}

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


        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Predicate<Integer> isEveN=(e)->e%2==0;
        for (int e:list){
            System.out.println(isEveN.test(e));
        }

        System.out.println();

        // Example: Chaining Predicates (and(), or(), negate())

        // negate() method in a Predicate means opposite or logical NOT of the condition.

        Predicate<String> startsWithA=(e)->e.startsWith("A");
        Predicate<String> endsWithe=(e)->e.endsWith("e");
        Predicate<String> combined=startsWithA.and(endsWithe);
        Predicate<String> combinedI=startsWithA.or(endsWithe);
        Predicate<String> combinedII=startsWithA.negate();

        System.out.println(combined.test("Apple")); //true
        System.out.println(combinedI.test("bToZ")); //false
        System.out.println(combinedII.test("Aae"));  //false

        // Example:  Custom Validation Example

        User obj=new User("john",20);

        Predicate<User> isAdult=(e)->e.age>=18;
        Predicate<User> validName=(e)->e.username.length()>=3;

        boolean isValid=isAdult.and(validName).test(obj);
        System.out.println(" user valid : " +isValid);  // true


        // Example :. Predicate with Null Checks (Safe Code)

        Predicate<String> notNull=(e)->e!=null;
        Predicate<String> noTEmpty=(e)->!e.isEmpty();

        System.out.println();

        Predicate<String> safeCheck=notNull.and(noTEmpty);
        System.out.println(safeCheck.test("hello")); // true
        System.out.println(safeCheck.test(""));   //false














    }
}
