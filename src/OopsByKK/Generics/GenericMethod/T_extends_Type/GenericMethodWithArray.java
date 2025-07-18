package OopsByKK.Generics.GenericMethod.T_extends_Type;

import java.util.Arrays;

public class GenericMethodWithArray {

    //  1. Simple Generic Method with Array (Print Elements)

    public static <T> void printArr(T[] array) {

        for (T ele : array) {

            System.out.print(ele + " ");

        }

        System.out.println();


    }

    // 2. Generic Method to Return the First Element of Array
    public static <T> T getFirst(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[0];
    }


    // 3. Bounded Type: Generic Array Method With T extends Number

    public static <T extends Number> double sum(T[] arr){

        double total = 0.0;
        for (T num : arr) {
            total += num.doubleValue(); // convert all types to double
        }
        return total;


    }


    //  4. Generic Method Returning Array

    public static  <T> T[] returnArr(T[] arr){

        return arr;
    }





    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Hello", "World"};
        Double[] dblArray = {1.1, 2.2, 3.3};

        printArr(intArray);
        printArr(strArray);
        printArr(dblArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(strArray));
        System.out.println(getFirst(dblArray));

        System.out.println(sum(intArray));
        System.out.println(sum(dblArray));


        Integer[] ans=returnArr(intArray);
        System.out.println(Arrays.toString(ans));
        String[] ans1=returnArr(strArray);
        System.out.println(Arrays.toString(ans1));
        Double[] ans2=returnArr(dblArray);
        System.out.println(Arrays.toString(ans2));







    }
}
