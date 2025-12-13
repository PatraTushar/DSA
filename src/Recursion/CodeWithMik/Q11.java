package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.List;

public class Q11 {

    static void generateSubsets(int[] num, int n, List<Integer> ans, List<List<Integer>> result, int idx) {

        if (idx == n) {

            result.add(new ArrayList<>(ans));
            return;
        }


        ans.add(num[idx]);
        generateSubsets(num, n, ans, result, idx + 1);

        ans.remove(ans.size() - 1);
        generateSubsets(num, n, ans, result, idx + 1);

    }


    static List<List<Integer>> subsets(int[] num) {

        //  Time Complexity: O(n × 2ⁿ)
        //  Space Complexity: : O(n × 2ⁿ)


        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(num, num.length, new ArrayList<>(), result, 0);

        return result;


    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3};
        List<List<Integer>> ans = subsets(num);
        System.out.println(ans);

    }
}
