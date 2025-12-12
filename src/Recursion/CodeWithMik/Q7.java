package Recursion.CodeWithMik;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q7 {

    static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        int length = s.length();

        for (int i = 0; i < length; i++) {

            char ch = s.charAt(i);

            if (ch == '(') st.push(ch);

            else if (ch == ')') {

                if (st.isEmpty()) return false;
                st.pop();
            }

        }

        return st.isEmpty();
    }


    static void generate(String curr, int n, List<String> ans) {


        if (curr.length() == 2 * n) {
            if (isValid(curr)) ans.add(curr);
            return;

        }


        generate(curr + '(', n, ans);
        generate(curr + ')', n, ans);


    }


    static List<String> generateParenthesis(int n) {

        //  Time Complexity: O(Cₙ * n)
        //  Space Complexity:  O(2n)->O(n)



        List<String> result = new ArrayList<>();
        generate("", n, result);

        return result;


    }

    static void generateI(String curr, int n, int open, int close, List<String> ans) {

        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        if (open < n) generateI(curr + '(', n, open + 1, close, ans);

        if (close < open) generateI(curr + ')', n, open, close + 1, ans);


    }


    static List<String> generateParenthesisI(int n) {

        //  Time Complexity: O(2^2n * n)
        //  Space Complexity:  O(2n)->O(n)


        List<String> result = new ArrayList<>();
        generateI("", n, 0, 0, result);

        return result;


    }


    public static void main(String[] args) {

        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);

        List<String> result1=generateParenthesisI(n);
        System.out.println(result1);


    }
}
