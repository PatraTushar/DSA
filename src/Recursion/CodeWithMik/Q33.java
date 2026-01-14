package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.List;

public class Q33 {

    static void solve(String digits, StringBuilder ans, List<String> list, int index) {

        String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


        if (index == digits.length()) {

            list.add(ans.toString());
            return;


        }

        int digit = digits.charAt(index) - '0';

        String letters = phone[digit];


        for (int i = 0; i < letters.length(); i++) {

            ans.append(letters.charAt(i));
            solve(digits, ans, list, index + 1);
            ans.deleteCharAt(ans.length() - 1);
        }


    }

    static List<String> letterCombinations(String digits) {

        //  Time Complexity (TC): O(n * 4^n)
        //  Space Complexity (SC): O(n * 4^n)


        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) return result;

        solve(digits, new StringBuilder(), result, 0);

        return result;


    }


    public static void main(String[] args) {

        String digits = "23";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);


    }
}
