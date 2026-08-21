package Java8Features.DilipSir.FunctionalInterface.Predefined;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void printCurrentTimeNow(Supplier<LocalDateTime> dateTime){

        System.out.println(dateTime.get());
    }

    public static void main(String[] args) {

        // Get Date And Time Always
        Supplier<LocalDateTime> dateTime = ()->LocalDateTime.now();
        //System.out.println(dateTime.get());

        printCurrentTimeNow(dateTime);


    }
}
