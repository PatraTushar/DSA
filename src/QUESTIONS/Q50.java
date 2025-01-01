package QUESTIONS;


import java.util.Scanner;
public class Q50 {
    static  void printArray(int arr[]){


        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


    static int[] prefixSum(int arr[]){



        int m=arr.length;

        int[] prefix=new int[m];
        prefix[0]=arr[0];

        for(int i=1;i<m;i++){

            prefix[i]=prefix[i-1] + arr[i];




        }
        return prefix;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" input array ");
        printArray(arr);

        int[] prefix=prefixSum(arr);
        printArray(prefix);



    }
}
