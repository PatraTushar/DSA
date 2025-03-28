package stacksByKK.InterviewQuestion;

import java.util.Stack;

public class Q1 {

    static boolean balancedBracket(String str){

        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }

            else {
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }

        if(st.size()>0) return false;
        return true;
    }

    public static void main(String[] args) {

        // Q: Balanced brackets

        String str="()(())";
        System.out.println(balancedBracket(str));
    }
}
