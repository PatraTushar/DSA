package functionsByKK;

import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrong(int n){

        // count the number of digit

        int temp=n;
        int count=0;
        int ans=0;

        while(temp>0){

            count++;
            temp=temp/10;
        }

        temp=n;
        while(temp>0){

            int digit=temp%10;
            ans+=Math.pow(digit,count);
            temp=temp/10;
        }

        if(ans==n){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a number ");
        int n=sc.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);


//        for(int i=100;i<1000;i++){
//
//            if(isArmstrong(i)){
//
//                System.out.print(i +" ");
//            }
//        }


    }
}
