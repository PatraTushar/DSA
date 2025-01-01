package QUESTIONS;


import java.util.Scanner;
public class Q35 {


    static int lastOccurance(int arr[],int X) {

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == X) {
                lastIndex = i;

            }



        }
        return lastIndex;


    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println(" enter " + n + " elements ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter X ");
        int X=sc.nextInt();

        System.out.println(" last  occurance of X "  + lastOccurance(arr,X));



    }
}
