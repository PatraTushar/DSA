package OopsByKK.LambdaFunction.LambdExpression;

// Implementing functional interface by lambda expression
interface GreetingService{
    void greet(String message);
}
public class LambdaBasics {

    public static void main(String[] args) {

        GreetingService obj=message -> System.out.println(" Hello ," +message);

        obj.greet("world");



    }
}
