package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q7 {

    static int pairSum(int arr[],int n,int target){

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]==target){
                    count++;
                }
            }
        }

        return count;
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


        System.out.println(" enter target");
        int target=sc.nextInt();

        int ans=pairSum(arr,n,target);
        System.out.println(" Total number of pairs is  " +ans);
    }
}
