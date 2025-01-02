package RECURSION;

import java.util.Scanner;

public class Q18 {

    static String remove(String str,int index){

        String ans;
        //BASE CASE
        if(index==str.length()){
            return "";
        }

        //RECURSIVE WORK

       String smallAns= remove(str,index+1);

       //SELF WORK
        if(str.charAt(index)=='a'){
             ans=smallAns;
        }

        else{
             ans=str.charAt(index)+smallAns;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        String ans=remove(str,0);
        System.out.println(ans);
    }
}
