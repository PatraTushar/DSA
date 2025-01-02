package DSA_PRACTICE.STRING;

import java.util.Scanner;

public class Q74 {

    static void stringCompression(String str){             // input-->aaabbbbccddde

          String ans=""+str.charAt(0);                     //output-->a3b4c2d3e

        int count=1;

        for(int i=1;i<str.length();i++){

            char curr=str.charAt(i);
            char prev=str.charAt(i-1);

            if(curr==prev){
                count++;
            }

            else{

                ans=ans+count;
                count=1;
                ans=ans+curr;

            }
        }
        ans=ans+count;
        System.out.println(ans);

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        stringCompression(str);



    }
}
