package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q11 {

    static int repeating(int arr[],int n){

        int ans=-1;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){

                    return arr[i];

                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter elements in the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" first value that is repeating is " +repeating(arr,n));


    }
}
