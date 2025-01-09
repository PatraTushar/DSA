package basicsByKK;

import java.util.Scanner;

public class reverseNumber {

    static int reverse(int n){

        int ans=0;

        while(n>0){


            int rem=n%10;
            ans=ans * 10+rem;
            n=n/10;

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a number ");
        int number=sc.nextInt();


        int ans=reverse(number);
        System.out.println(" reverse is " +ans);



    }
}
