package QUESTIONS;

import java.util.Scanner;
public class Q38 {

    static int tripletSum(int arr[],int target){

        int ans=0;
        int n=arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; i < n; i++){
                for(int k = j+1; k < n; k++){

                    if(arr[i]+ arr[j] + arr[k] == target){

                        ans++;

                    }

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of the array");
        int m=sc.nextInt();
        int arr[]=new int[m];

        System.out.println(" enter " + m + " elements ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target sum");
        int target= sc.nextInt();

        System.out.println(tripletSum(arr,target));


    }
}
