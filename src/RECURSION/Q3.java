package RECURSION;

import java.util.Scanner;

public class Q3 {

    static int printFactorial(int n){

        //BASE CASE
        if(n==0){
            return 1;
        }

        //RECURSIVE WORK

        int smallAns=printFactorial(n-1);

        //SELF WORK
        int ans=n*smallAns;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        System.out.println(" factorial of " + n + " is ");

        System.out.println(printFactorial(n));


    }
}
