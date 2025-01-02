package QUESTIONS;

import java.util.Scanner;
public class Q37 {

    static int pairSum(int arr[],int target){

        int ans=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j< arr.length;j++){

                if(arr[i] + arr[j]==target){
                    ans++;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n= sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter target sum");
        int target=sc.nextInt();

        System.out.println(pairSum(arr,target));



    }
}
