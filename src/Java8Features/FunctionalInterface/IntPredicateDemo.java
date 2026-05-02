package Java8Features.FunctionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

    public static void main(String[] args) {

        int[] arr = {0, 5, 10, 15, 20, 25, 30};

        IntPredicate p = (x) -> x % 2 == 0;


        for (int ele:arr){

            if (p.test(ele)) System.out.println(ele);
        }


    }
}


// To avoid autoboxing/unboxing overhead and improve performance when working with primitive int.

// Autoboxing = converting primitive → object automatically

//Unboxing = converting object → primitive automatically