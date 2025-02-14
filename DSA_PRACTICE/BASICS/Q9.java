package DSA_PRACTICE.BASICS;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();
        int ans=0;

        for(int i=1;i<n;i++){

            if(i%2==0){
                ans=ans-i;
            }

            else{
                ans=ans+i;
            }
        }

        System.out.println(" ans is " +ans);

    }
}
