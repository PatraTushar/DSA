package Recursion.CodeWithMik;



import java.util.ArrayList;
import java.util.List;

public class Q30 {

    static boolean isPalindrome(String s, int start, int end) {

        if (start >= end) return true;

        if (s.charAt(start) != s.charAt(end)) return false;

        return isPalindrome(s, start + 1, end - 1);

    }


    static void palindromePartitioning(String s, int index, List<String> ans, List<List<String>> result) {

        if (index == s.length()) {

            result.add(new ArrayList<>(ans));
            return;
        }


        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s, index, i)) {

                ans.add(s.substring(index, i + 1));
                palindromePartitioning(s, i + 1, ans, result);
                ans.remove(ans.size() - 1);
            }

        }


    }


    static List<List<String>> partition(String s) {

        //  Time Complexity (TC): O(n * 2^n)
        //  Space Complexity (SC): O(n * 2^n)


        List<List<String>> result = new ArrayList<>();

        palindromePartitioning(s, 0, new ArrayList<>(), result);

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->131

        String s = "aab";
        List<List<String>> result = partition(s);
        System.out.println(result);
    }
}
