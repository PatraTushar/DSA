package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q77 {

    static int  factorial(int n){

        if( n==1){
            return 1 ;
        }

        int ans=factorial(n-1);

        int finalAns=n*ans;


        return finalAns;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        int ans=factorial(n);

        System.out.println(" factorial is ");
        System.out.println(ans);

    }
}
