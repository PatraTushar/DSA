package OOPS.Generics.Wildcards;

import java.util.List;

public class UpperBound {


    // In upper bound (? extends T), you cannot add any element except null because the exact type is unknown, so it is mainly used for reading.
     // While passing, you can pass T or any of its subclasses (child classes).



    public static void printNumbers(List<? extends Number> list){

        for(Number num:list){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        List<Integer> list=List.of(1,2,3);
        printNumbers(list);
        List<Double> list1=List.of(1.1,2.2,3.3);
        printNumbers(list1);
        List<Number> list2=List.of(12,46,89);
        printNumbers(list2);







    }
}


// PECS Rule:
// Producer Extends → use ? extends T when you only read data (no adding except null)
// Consumer Super   → use ? super T when you add data (can add T and its subclasses)
