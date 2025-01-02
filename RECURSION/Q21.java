package RECURSION;

import java.util.Scanner;

public class Q21 {


    static boolean palindromeornot(String str,int l,int r) {     //LEVEL


        if (l >= r) {
            return true;
        }
        if (str.charAt(l) == str.charAt(r) && palindromeornot(str,l+1,r-1)) {

            return true;


        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        System.out.println(palindromeornot(str,0,str.length()-1));

    }
}
