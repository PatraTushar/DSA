package stacksByKK.Infix;

import java.util.Stack;

public class postfixToInfix {

    static String evaluation(String postfix){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        Stack<String> st=new Stack<>();
        int i=0;
        int n=postfix.length();

        while (i<n){

            char ch=postfix.charAt(i);

            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || ch>='0' && ch<='9'){

                st.push(ch +"");
            }

            else {
                String top2=st.pop();
                String top1=st.pop();
                String result="(" + top1 + ch + top2 + ")";
                st.push(result);
            }

            i++;
        }

        return st.peek();


    }


    public static void main(String[] args) {

        String postfix="AB-DE+F*/";
        System.out.println(evaluation(postfix));


    }
}
