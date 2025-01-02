package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q79 {

    static int sum(int n){

        if(n>=0 && n<=9)
        {
            return n;
        }
        int ans=sum(n/10);
        int finalAns=ans+n%10;

        return finalAns;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        int ans=sum(n);
        System.out.println(" sum is " +ans);

    }
}
