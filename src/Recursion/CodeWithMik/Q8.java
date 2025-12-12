package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q8 {


    // generate all permutation
    static void permutation(String ans, String s, List<String> result, int i) {


        if (i == s.length()) {

            result.add(ans);
            return;
        }

        permutation(ans + s.charAt(i), s, result, i + 1);
        permutation(ans, s, result, i + 1);


    }

    static List<String> AllPossibleStrings(String s) {

        //  Time Complexity: O(2^n)
        //  Space Complexity: O(n · 2ⁿ)

        List<String> result = new ArrayList<>();
        permutation("", s, result, 0);
        return result;
    }


    // generate non-empty subsequence is lexicographically sorted order

    static void permutationI(String ans, String s, List<String> result, int i) {

        if (i == s.length()) {

            if (!ans.isEmpty()) result.add(ans);

            return;
        }


        permutationI(ans + s.charAt(i), s, result, i + 1);
        permutationI(ans, s, result, i + 1);


    }


    static List<String> AllPossibleStringsI(String s) {

        //  Time Complexity: O(2^n * n)
        //  Space Complexity:  O(n · 2ⁿ)

        List<String> result = new ArrayList<>();
        permutationI("", s, result, 0);
        Collections.sort(result);
        return result;


    }


    public static void main(String[] args) {

        String s = "abc";
        List<String> result = AllPossibleStrings(s);
        System.out.println(result);
        List<String> result1 = AllPossibleStringsI(s);
        System.out.println(result1);

    }
}
