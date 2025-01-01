package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q1 {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
    }



    static int sumOfElements(int arr[],int size){


        int sum=0;

        for(int i=0;i<size;i++){
            sum+=arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println(" enter elements of the array ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" input matrix");
        printArray(arr);

        System.out.println(" sum of array is ");
        int answer=sumOfElements(arr,size);
        System.out.println(answer);



    }
}
