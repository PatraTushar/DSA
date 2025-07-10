package OopsByKK.Generics.Wildcards;

import java.util.List;

public class UpperBound {

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







    }
}
