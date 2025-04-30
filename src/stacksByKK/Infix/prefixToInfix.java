package stacksByKK.Infix;

import java.util.Stack;

public class prefixToInfix {

    static String evaluation(String prefix){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        Stack<String> st=new Stack<>();
        int n=prefix.length();
        int i=n-1;

        while (i>=0){

            char ch=prefix.charAt(i);


            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || ch>='0' && ch<='9'){

                st.push(ch +"");
            }

            else {

                String top1=st.pop();
                String top2=st.pop();
                String result="(" + top1 + ch + top2 + ")";
                st.push(result);
            }

            i--;



        }

        return st.peek();


    }

    public static void main(String[] args) {

        String prefix="*+PQ-MN";
        System.out.println(evaluation(prefix));
    }
}
