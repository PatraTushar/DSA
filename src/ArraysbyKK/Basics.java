package ArraysbyKK;


import java.util.Arrays;
import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // printing an array

//        int arr[]={10,20,30,40,50};
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }
//
//        System.out.println();
//

        // for each loop

//        for(int num:arr){  // for every element in the array, print the element
//            System.out.print(num +" ");  // Here num represents the element of the array
//        }
//
//        System.out.println();
//
//        System.out.println(Arrays.toString(arr));

        // Array of objects

        String[] str=new String[4];

        System.out.println(" enter strings ");

        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));
        str[1]="kunal";
        System.out.println(Arrays.toString(str));

    }
}
