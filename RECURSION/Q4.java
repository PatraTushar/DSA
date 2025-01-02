package RECURSION;

import java.util.Scanner;

public class Q4 {

    static int findingFibonaccinumber(int n){

        //BASE CASE
        if(n==0 || n==1){
            return n;
        }

        //RECURSIVE WORK

        int prev=findingFibonaccinumber(n-1);
        int prevPrev=findingFibonaccinumber(n-2);

        //self work

        int ans=prev + prevPrev;

        return ans;


    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();


      //  System.out.println(+ n + " fibonacci number is " +findingFibonaccinumber(n));

        for(int i=0;i<n;i++){
            System.out.print(findingFibonaccinumber(i) +" ");
        }



    }
}
