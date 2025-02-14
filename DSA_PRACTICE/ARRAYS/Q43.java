package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q43 {

    static int occurances(int arr[],int n,int X){

        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==X){
                count++;
            }
        }

        return count;

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

        System.out.println(" enter X ");
        int X=sc.nextInt();

        System.out.println(" number of occurances is " +occurances(arr,n,X));
    }
}
