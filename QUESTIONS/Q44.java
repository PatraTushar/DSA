package QUESTIONS;

import java.util.Scanner;
public class Q44 {

        static void reverseArray(int arr[]){

      int i=0,j=arr.length-1;
        while(i < j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }



    }

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter "  + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println();

        reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }


    }
}
