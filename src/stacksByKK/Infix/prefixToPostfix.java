package stacksByKK.Infix;

import java.util.Stack;

public class prefixToPostfix {

    static  String evaluation(String prefix){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int n=prefix.length();
        Stack<String> st=new Stack<>();
        int i=n-1;

        while (i>=0){

            char ch=prefix.charAt(i);

            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || ch>='0' && ch<='9'){

                st.push(ch +"");
            }

            else {

                String top1=st.pop();
                String top2=st.pop();
                String result=top1 + top2 + ch;
                st.push(result);
            }
            i--;



        }

        return st.peek();
    }
    public static void main(String[] args) {

        String prefix="/-AB*+DEF";
        System.out.println(evaluation(prefix));


    }
}
