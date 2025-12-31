package Recursion.CodeWithMik;

import java.util.*;

public class Q29 {




    static void helper(int[] num, int index, List<Integer> ans, List<List<Integer>> result) {

        if (index == num.length) {
            if (ans.size() >= 2) {
                result.add(new ArrayList<>(ans));
            }
            return;
        }

        // INCLUDE
        if (ans.isEmpty() || num[index] >= ans.get(ans.size() - 1)) {
            ans.add(num[index]);
            helper(num, index + 1, ans, result);
            ans.remove(ans.size() - 1);
        }

        // EXCLUDE (skip duplicates)
        if (ans.isEmpty() || num[index] != ans.get(ans.size() - 1)) {
            helper(num, index + 1, ans, result);
        }

    }


    static List<List<Integer>> find(int[] num) {

        //  Time Complexity (TC): O(n * 2^n)
        //  Space Complexity (SC): O(n * 2^n)


        List<List<Integer>> result = new ArrayList<>();
        helper(num, 0, new ArrayList<>(), result);
        return result;






    }

    public static void main(String[] args) {

        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> res = find(nums);
        System.out.println(res);


    }
}
