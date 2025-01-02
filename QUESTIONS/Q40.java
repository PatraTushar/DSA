package QUESTIONS;

import java.util.Scanner;
public class Q40 {

    static int findMax(int arr[]){

        int max=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int secondMax(int arr[]){


        int max=findMax(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondMax=findMax(arr);
        return secondMax;

    }





    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter "  + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();



        }
        System.out.println(" second max is " +secondMax(arr));

    }
}
