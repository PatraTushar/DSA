package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q80 {

    static int count(int n){

        if(n==0){
            return n;
        }

        int ans=count(n/10);

        int finalAns=ans+1;

        return finalAns;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();


        int ans=count(n);
        System.out.println(" count is " +ans);


    }
}
