package OopsByKK.Generics.GenericMethod.GenericMethodRules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rules {

    // Write a generic method printArray() that takes any type of array and prints all its elements.
    public static class Array {

        public static <T> void printArr(T[] arr) {

            for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }


        // getLastElement() — Print First Element
        public static <T> void printFirstElement(T[] arr) {

            if (arr != null && arr.length > 0) {
                System.out.println("First element: " + arr[0]);
            } else {

                System.out.println("Array is empty or null.");
            }


        }


        // getLastElement() — Return Last Element
        public static <T> T returnLastElement(T[] arr) {

            //The return type will match the type of array passed at method call time

            int n = arr.length;

            return arr[n - 1];


        }


        // swapElements() — Swap Two Elements in an Array
        public static <T> void swapElements(T[] arr, int i, int j) {

            if (i < arr.length && j < arr.length) {

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }


        }


        // arrayToList() — Convert Array to List
        public static <T> List<T> arrayToList(T[] arr) {

            ArrayList<T> list = new ArrayList<>();

            for (T ele : arr) {
                list.add(ele);
            }

            return list;


        }

        // isEqual() — Compare Two Values for Equality
        public static <T> boolean compareValues(T a, T b) {

            return a.equals(b);
        }

        //countOccurrences() — Count Occurrence of a Value in Array

        public static <T> int countOccurrences(T[] arr,T target){

            int count=0;

            for (T item : arr) {
                if (item == null && target == null) count++;
                else if (item != null && item.equals(target)) count++;
            }

            return count;
        }

       // reverseArray() — Reverse Any Array in-place

        public static <T> void reverseArray(T[] arr){

            int i=0;
            int j=arr.length-1;

            while (i<j){

                swapElements(arr,i,j);
                i++;
                j--;
            }

            System.out.println(Arrays.toString(arr));


        }

        // copyArray() — Copy Elements from One Array to Another



        public static <T> void copyArray(T[] source,T[] destination){

            int len = Math.min(source.length, destination.length);
            for (int i = 0; i < len; i++) {
                destination[i] = source[i];
            }



        }

        // toStringArray() — Convert Any Array to String Array

        public static <T> String[] convertToStringArr(T[] arr){

            String[] str=new String[arr.length];

            for(int i=0;i<arr.length;i++){

                str[i]=String.valueOf(arr[i]);   // String.valueOf(arr[i])->It converts any value into a String, safely.
            }

            return str;
        }

        // print2DArray() — Print Any 2D Array

        public static <T> void print2DArray(T[][] arr){

            int rows=arr.length;
            int cols=arr[0].length;

            for(int i=0;i<rows;i++){

                for (int j=0;j<cols;j++){

                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

        public static <T> T getMiddle(T[] arr){

            if(arr.length==0) return null;

            return arr[arr.length/2];
        }

        // Write a method that takes a key-value pair and prints it.

        public static <k,v> void printPair(k key,v value){

            System.out.println("Key: " + key +" ---- "+ " Value: " + value);

        }

        // Show that you can overload a method — one generic, one non-generic.



        public static void printMethod(String value){

            System.out.println("String value: " + value);
        }

        public static <T> void printMethod(T value){

            System.out.println("Generic value: " + value);


        }








    }

    public static void main(String[] args) {


        Integer[] arr = {1, 2, 3, 4, 5};
        String[] arr2 = {"Kunal", "Rohit", "Raj", "Siraj", "Bumrah"};
        Integer[] arr3 = {1, 2, 3, 4, 5,3,7};
        String[] arr4 = {"Raj","Kunal", "Rohit", "Raj", "Siraj","Raj", "Bumrah","Raj"};

        Array.printArr(arr);
        Array.printArr(arr2);
        Array.printFirstElement(arr);
        Array.printFirstElement(arr2);
        System.out.println(Array.returnLastElement(arr));
        System.out.println(Array.returnLastElement(arr2));
        Array.swapElements(arr, 1, 4);
        Array.swapElements(arr2, 1, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        List<Integer> list = Array.arrayToList(arr);
        List<String> list2 = Array.arrayToList(arr2);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(Array.compareValues(10, 10));
        System.out.println(Array.compareValues(10, 67));
        System.out.println(Array.compareValues("Raj", "Raj"));
        System.out.println(Array.compareValues("Raj", "Sharma"));
        System.out.println(Array.countOccurrences(arr3,3));
        System.out.println(Array.countOccurrences(arr4,"Raj"));
        Integer[] arr5 = {1, 2, 3, 4, 5};
        String[] arr6 = {"Kunal", "Rohit", "Raj", "Siraj", "Bumrah"};
        Array.reverseArray(arr5);
        Array.reverseArray(arr6);
        Integer[] arr7 = {10, 20, 30, 40, 50};
        String[] ans=Array.convertToStringArr(arr7);
        System.out.println(Arrays.toString(ans));
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String[][] names = {
                {"Java", "Python", "C++"},
                {"Spring", "Hibernate", "JDBC"},
                {"Git", "Docker", "Kubernetes"}
        };

        Array.print2DArray(matrix);
        Array.print2DArray(names);
        System.out.println(Array.getMiddle(arr5));
        System.out.println(Array.getMiddle(arr6));
        Array.printPair("Rahul",100);

        Array.printPair(14.56,'A');

        Array.printMethod("Hello");  // Calls String-specific method
        Array.printMethod(123);      // Calls generic method
        Array.printMethod(true);    // Calls generic method







    }
}
