package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q46 {

    static int pairs(int arr[],int n,int target){

        int count=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]+arr[j]==target){
                    count++;

                }
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

        System.out.println(" enter target ");
        int target=sc.nextInt();

        System.out.println(" Total pairs is " +pairs(arr,n,target));


    }
}
