package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q81 {

    static int power(int p,int q){

        if(q==0){
            return 1;
        }

        int ans=power(p,q-1);
        int finalAns=ans*p;

        return finalAns;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter p ");
        int p=sc.nextInt();

        System.out.println(" enter q ");
        int q=sc.nextInt();

        int ans=power(p,q);
        System.out.println(" power is " +ans);

    }
}
