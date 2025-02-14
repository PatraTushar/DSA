package RECURSION;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q12 {

    static void printingElements(int arr[],int index){
        //BASE CASE
        if(index==arr.length){

            return;

        }

        //SELF WORK
        System.out.println(arr[index]);


        //RECURSIVE WORK
        printingElements(arr,index+1);



    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printingElements(arr,0);

    }
}
