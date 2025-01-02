package RECURSION;

import java.util.Scanner;

public class Q25 {

    static void stringSubsequence(String str,String currAns,String[] kp){          //253


        if(str.length()==0){
            System.out.print(currAns +" ");
            return;
        }
       int curr= str.charAt(0)-'0';    //2

       String currChoices=kp[curr];    //abc

        for(int i=0;i<currChoices.length();i++){
            stringSubsequence(str.substring(1), currAns+ currChoices.charAt(i) ,kp);
        }



    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        String currAns="";

        String[] kp={"", "", "abc" ,"def", "ghi","jkl", "mno","pqrs","tuv","wxyz"};
        //            0   1    2      3      4     5      6      7     8      9


        stringSubsequence(str,currAns,kp);
    }


}
