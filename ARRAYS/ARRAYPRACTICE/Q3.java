package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q3 {

    static int search(int arr[],int n,int X){

        int ans=-1;

        for(int i=0;i<n;i++){

            if(arr[i]==X){
                ans=i;

            }
        }

        return ans;


    }

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter search elements ");
        int X=sc.nextInt();

        int ans=search(arr,n,X);
        System.out.println(" index is " + ans);



    }
}
