package RECURSION;

import java.util.Scanner;

public class Q17 {

    static void findIndices(int arr[],int target,int index){

        //BASE CASE

        if(index==arr.length){
            return ;
        }


        //SELF WORK

        if(arr[index]==target){
            System.out.println(index);
        }




        //RECURSIVE WORK

        findIndices(arr,target,index+1);
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

        System.out.println(" indices are ");
        findIndices(arr,target,0);


    }
}
