package RECURSION;

import BASICS.BinaryToDecimal;

import java.util.Scanner;

public class Q15 {

    static boolean searchingElements(int arr[],int target,int index){

        //BASE CASE

        if(index== arr.length){
            return false;
        }

        //RECURSIVE WORK

        Boolean ANS=searchingElements(arr,target,index+1);

        //SELF WORK

        if(arr[index]==target){
            return true;
        }

        return ANS;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter target ");
        int target=sc.nextInt();

        boolean ans=searchingElements(arr,target,0);
        System.out.println(ans);

    }
}
