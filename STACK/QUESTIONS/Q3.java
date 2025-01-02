package STACK.QUESTIONS;

import java .util.*;

public class Q3 {

    public static boolean bracketValidOrNot(String str){

        Stack<Character> st=new Stack<>();

        int n=str.length();

        for(int i=0;i<n;i++){

            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' ||ch=='['){

                st.push(ch);
            }

            else if(ch==')' || ch=='}' || ch==']'){

                if(st.size()==0) return false;

                char top=st.pop();

                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')) return false;


            }


        }

        if(st.size()>0) return false;
        else return true;

    }

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a string ");
        String str=sc.nextLine();

        System.out.println(bracketValidOrNot(str));

    }
}
