package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q41 {

    static int max(int arr[],int n){

        int max=0;

        for(int i=0;i<n;i++){

            if(arr[i]>max){
                max=arr[i];
            }

        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" maximum is " +max(arr,n));


    }
}
