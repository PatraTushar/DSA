package basicsByKK;

import java.util.Scanner;

public class fibonacciNumbers {

    static void fibonacci(int n){

        int prev=0;
        int curr=1;
        int count=2;

        while(count<=n){

            int temp=curr;
            curr=prev+curr;
            prev=temp;
            count++;

        }

        System.out.println(curr);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();
        fibonacci(n);




    }
}
