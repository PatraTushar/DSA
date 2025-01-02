package RECURSION;

import java.util.Scanner;

public class Q20 {



    static String reverse(String str,int index){

        String finalAns;
        if(index==str.length()){
            return "";
        }

        String smallans=reverse(str,index+1);

        finalAns=smallans + str.charAt(index);

        return finalAns;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

       String rev= reverse(str,0);
        System.out.println(rev);

       if(str.equals(rev)){
           System.out.println(" it is a  palindrome");
       }

       else{
           System.out.println(" not a palindrome");
       }

    }
}
