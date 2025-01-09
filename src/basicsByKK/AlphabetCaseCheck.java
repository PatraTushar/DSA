package basicsByKK;

import java.util.Scanner;

public class AlphabetCaseCheck {

    static void caseCheck(char ch){

        if(ch>='a' && ch<='z'){
            System.out.println(" Lowercase");
        }

        else{
            System.out.println(" uppercase ");
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a character ");
        char ch=sc.next().trim().charAt(0);
        caseCheck(ch);




    }
}
