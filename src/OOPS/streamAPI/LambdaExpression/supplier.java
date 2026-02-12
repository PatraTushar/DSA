package OOPS.streamAPI.LambdaExpression;

import java.util.Random;
import java.util.function.Supplier;

class HeavyResource{

    HeavyResource(){
        System.out.println(" HeavyResource created ");
    }
}

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

        //Example – Lazy Initialization

        Supplier<HeavyResource> heavyResourceSupplier=()->new HeavyResource();

        System.out.println(" before calling get() ");
        HeavyResource resource=heavyResourceSupplier.get();
        System.out.println("After calling get()");


        System.out.println();

        // Advanced Example – Random Number Supplier

        Supplier<String> otpSupplier=()->{

            StringBuilder otp=new StringBuilder();
            Random random=new Random();

            for(int i=0;i<6;i++){
                otp.append(random.nextInt(10));
            }

            return otp.toString();
        };

        System.out.println(" generated otp " +otpSupplier.get());





    }
}
