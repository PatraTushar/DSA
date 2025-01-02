package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q4 {

    static int numberOfOccurances(int arr[],int n,int X){

        int ans=0;

        for(int i=0;i<n;i++){
            if(arr[i]==X){
                ans++;
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

        System.out.println(" enter X ");
        int X= sc.nextInt();

        int ans=numberOfOccurances(arr,n,X);
        System.out.println(" number of occurances is "  + ans);


    }
}
