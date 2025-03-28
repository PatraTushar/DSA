package stacksByKK.InterviewQuestion;

import java.util.Stack;

public class Q2 {

    static int bracketRemoveToMakeSequenceBalanced(String str){

        Stack<Character> st=new Stack<>();
        int removed=0;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch=='('){
                st.push(ch);
            }

            else {

                if(st.size()!=0 && st.peek()=='('){
                    st.pop();
                }

                else {
                    removed++;
                }
            }
        }

        removed+=st.size();
        return removed;
    }

    public static void main(String[] args) {

        System.out.println(bracketRemoveToMakeSequenceBalanced("(()))"));  // Output: 1
        System.out.println(bracketRemoveToMakeSequenceBalanced("((("));    // Output: 3
        System.out.println(bracketRemoveToMakeSequenceBalanced(")))"));    // Output: 3
        System.out.println(bracketRemoveToMakeSequenceBalanced("()()"));   // Output: 0
        System.out.println(bracketRemoveToMakeSequenceBalanced("())("));   //// Output: 2


    }
}
