package STRINGS;

import java.util.*;

public class Q5 {

    static void reverseStringInWord(String str){

        String ans="";
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
                                                 //input-->i am an educator
            if(ch!=' '){                         //output-->i ma na rotacude

                sb.append(ch);


            }

            else{
                sb.reverse();
                ans=ans+sb;
                ans=ans +" ";
                sb.delete(0,sb.length());
            }



        }
        sb.append(" ");
        sb.reverse();
        ans=ans+sb;
        System.out.println(ans);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        reverseStringInWord(str);



    }
}
