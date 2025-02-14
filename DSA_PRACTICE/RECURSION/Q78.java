package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q78 {

    static int fibonacci(int n){

        if(n==0 || n==1){
            return n;
        }

        int prev=fibonacci(n-1);
        int prevPrev=fibonacci(n-2);

        int ans= prev + prevPrev;

        return ans;





    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i) +" ");
        }

    }
}
