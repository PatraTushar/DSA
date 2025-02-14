package DSA_PRACTICE.STRING;

import java.util.Scanner;

public class Q72 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        boolean flag=true;

        int i=0,j=str.length()-1;

        while (i<j){

            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }

            i++;
            j--;
        }

        if(flag==true) System.out.println(" palindrome ");
        else System.out.println(" not a palindrome ");


    }
}
