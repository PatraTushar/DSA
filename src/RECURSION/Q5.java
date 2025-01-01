package RECURSION;

import java.util.Scanner;

public class Q5 {

    static int sumOfDigits(int n){

        //BASE CASE

        if (n>=0 && n<=9){
            return n;
        }

        //RECURSIVE WORK

        int ans=sumOfDigits(n/10);

        //SELF WORK

        int finalAns=ans + n%10;


        return finalAns;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        System.out.println(" sum of digits ");
        System.out.println(sumOfDigits(n));

    }
}
