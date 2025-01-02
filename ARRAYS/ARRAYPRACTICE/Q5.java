package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q5 {

    static int lastOccurance(int arr[],int n,int X){

        int ans=0;

        for(int i=0;i<n;i++){           //5 6 5 3 5 4           X=5

            if(arr[i]==X){

                ans=i;



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

        System.out.println(" enter X");
        int X=sc.nextInt();

        int ans=lastOccurance(arr,n,X);
        System.out.println(" last occurance is " + ans);






    }
}
