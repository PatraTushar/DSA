package RECURSION;

import java.util.Scanner;

public class Q14 {

    static int printingsum(int arr[],int index){
        //BASE CASE

        if(index==arr.length-1){
            return arr[index];
        }

        //RECURSIVE WORK
        int ans=printingsum(arr,index+1);

        //SELF WORK
        int sum=ans + arr[index];

        return sum;
    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int finalans=printingsum(arr,0);
        System.out.println( "sum is " +finalans);

    }
}
