package RECURSION;

import java.util.Scanner;

public class Q19 {

    static String reverse(String str,int index ){

        String finalAns;

        //BASE CASE

        if(index==str.length()){
            return "";
        }

        //RECURSIVE WORK

        String smallAns=reverse(str,index+1);;


        //SELF WORK

        finalAns=smallAns + str.charAt(index);

        return finalAns;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        String ans=reverse(str,0);
        System.out.println(ans);

    }
}
