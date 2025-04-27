package OopsByKK.streamAPI.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;


class Employee{

    String name;
    int age;
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class biPredicate {

    public static void main(String[] args) {

        // (i) It is a functional interface in java.util.function.
        // (ii) It takes two arguments and returns a boolean (true or false).
        // (iii) It represents a condition (or a test) involving two inputs.

        // Example:1 simple BiPredicate to check if sum of two numbers is even:

        BiPredicate<Integer,Integer> sumIsEven=(x,y)->(x+y)%2==0;
        System.out.println(sumIsEven.test(10,20));    //true

        // Example:2 Check if length of name is equal to a given number

        BiPredicate<String,Integer> isLengthEqual=(name,length)->name.length()==length;
        System.out.println(isLengthEqual.test("Rohan",5));  //true
        System.out.println(isLengthEqual.test("Raj",7));    //false

        //You can combine multiple BiPredicate using:
        //and()
        //or()
        //negate()


        // Example:3  Check if both numbers are positive AND even:

        BiPredicate<Integer,Integer> isPositive=(x,y)->x>0 && y>0;
        BiPredicate<Integer,Integer> isEven=(x,y)->x%2==0 && y%2==0;
        System.out.println(isPositive.and(isEven).test(10,20));  // true

        // Example:4 Check if either number is greater than 100:

        BiPredicate<Integer,Integer> isGreater=(x,y)->x>100 || y>100;
        System.out.println(isGreater.test(120,60));  //true
        System.out.println(isGreater.test(20,60));   //false

        //   use of negate()
        //In functional interfaces like Predicate<T>, negate() returns a new Predicate that gives the opposite result.

        BiPredicate<Integer,Integer> positive=(x,y)->x>0 && y>0;
        BiPredicate<Integer,Integer> isNotPositive=positive.negate();
        System.out.println(positive.test(100,200));  // true
        System.out.println(isNotPositive.test(100,200));  // false

        // Example:5 Check if sum is NOT even
        BiPredicate<Integer,Integer> isSumEven=(x,y)->(x+y)%2==0;
        BiPredicate<Integer,Integer> isSumOdd=isSumEven.negate();
        System.out.println(isSumOdd.test(10,20)); //  false
        System.out.println(isSumOdd.test(1,6)); //true

        // Example:6  Check if one string is prefix of another

        BiPredicate<String,String> isPrefix=(full,prefix)->full.startsWith(prefix);
        System.out.println(isPrefix.test("functionalInterface","func"));// true
        System.out.println(isPrefix.test("functionalInterface","Inter")); //false

        // Example:7 Validate Username and Password Length

        BiPredicate<String,String> isValid=(username,password)->username.length()>=5 && password.length()>=8;
        System.out.println(isValid.test("Rahul","123456789")); // true
        System.out.println(isValid.test("john","1234"));  //false

        //Example:8 Compare two integers for multiple conditions

        BiPredicate<Integer, Integer> isMultipleAndGreater = (a, b) -> (a % b == 0) && (a > b);
        System.out.println(isMultipleAndGreater.test(10, 2));  // true
        System.out.println(isMultipleAndGreater.test(2, 10));  // false

        //Example:9  Use BiPredicate in Filtering Collections
        // Suppose you have a list of employees with name and age.
        // Filter employees whose name starts with "A" and age > 25.

        List<Employee> employees= Arrays.asList(
                new Employee("Alice", 30),
                new Employee("Bob", 20),
                new Employee("Alex", 28),
                new Employee("Charlie", 32)
        );

        BiPredicate<String,Integer> startsWithAAndAgeAbove25 =(name,age)->name.startsWith("A") && age>25;
        for(Employee e :employees){
            if(startsWithAAndAgeAbove25.test(e.name,e.age)){
                System.out.println(e.name + " " + e.age);
            }
        }






    }
}
