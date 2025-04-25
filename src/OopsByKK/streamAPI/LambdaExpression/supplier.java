package OopsByKK.streamAPI.LambdaExpression;

import java.util.function.Supplier;

public class supplier {

    static String expensiveComputation(){
        System.out.println(" computing ");
        return " Result ";
    }

    static void printIfNeeded(boolean shouldPrint,Supplier<String> supplier){

        if(shouldPrint){

            System.out.println(supplier.get());
        }

    }

    public static void main(String[] args) {

        // Takes no input
        //Returns a result

        Supplier<String> obj=()->"Hello World ";
        System.out.println(obj.get());

        // Example:  Using with Method That Needs Lazy Evaluation
        printIfNeeded(true,()->expensiveComputation());



    }
}
