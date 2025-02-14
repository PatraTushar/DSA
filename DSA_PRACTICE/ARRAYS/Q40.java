package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q40 {

    static int sum(int arr[],int n){

        int sum=0;
        for(int i=0;i<n;i++){

            sum=sum+arr[i];

        }

        return sum;
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

        System.out.println(" sum is " +sum(arr,n));



    }
}
