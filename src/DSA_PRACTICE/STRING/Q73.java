package DSA_PRACTICE.STRING;

import java.util.Scanner;

public class Q73 {

    static void reverseStringInWord(String str) {

        String ans="";
        StringBuilder sb=new StringBuilder("");


        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch!=' '){

                sb.append(ch);
            }

            else{

                sb.reverse();
                ans=ans + sb;
                ans= ans + " ";
                sb.delete(0,sb.length());
            }
        }

        sb.reverse();
        ans=ans+sb;
        System.out.println(ans);
                                                                //i am an educator
                                                                // a ma na rotacude


    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        reverseStringInWord(str);






    }
}
