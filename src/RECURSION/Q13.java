package RECURSION;

import java.util.Scanner;

public class Q13 {

    static int findMax(int arr[],int index){

        //BASE CASE
        if(index== arr.length-1){
            return arr[index];
        }

        //RECURSIVE WORK

        int max=findMax(arr,index+1);

        //SELF WORK
        if(arr[index]>max){
            return arr[index];
        }


        return max;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int ans=findMax(arr,0);


        System.out.println(" max element is " + ans);





    }
}
