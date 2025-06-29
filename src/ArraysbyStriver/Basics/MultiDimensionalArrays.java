package ArraysbyStriver.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[3][4];

        // for taking input
        // for rows

        System.out.println(" enter elements ");

        for(int rows=0;rows<arr.length;rows++){


            // for columns
            for(int columns=0;columns<arr[rows].length;columns++){



                arr[rows][columns]=sc.nextInt();


            }


        }

         // for output

        for(int rows=0;rows<arr.length;rows++){

            // for columns
            for(int columns=0;columns<arr[rows].length;columns++){

                System.out.print(arr[rows][columns] +" ");


            }

            System.out.println();


        }


        // print using Arrays.toString method

        System.out.println(" printing using Arrays.toString method");

        for(int i=0;i<arr.length;i++){

            System.out.println(Arrays.toString(arr[i]));
        }


        // print using for each loop

        System.out.println(" printing using for each loop ");


            for(int[] a:arr){

                System.out.println(Arrays.toString(a));
            }


        }


    }

