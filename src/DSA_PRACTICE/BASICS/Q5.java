package DSA_PRACTICE.BASICS;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();
        int ans;


        for(int i=1;i<=n;i++){
            if(i % 3 ==0){
                continue;

            }

            ans=i;
            System.out.println(ans);

        }
    }
}
