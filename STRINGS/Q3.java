package STRINGS;

import java.util.*;

public class Q3 {

    //string is palindrome or not

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        int i=0;
        int j=str.length()-1;
        boolean flag=true;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;

            }

            i++;
            j--;


        }

        if(flag==true) System.out.println("palindrome");
        else System.out.println("not a palindrome");

    }
}
