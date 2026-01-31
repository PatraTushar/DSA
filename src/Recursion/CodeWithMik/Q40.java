package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {

    static void solve(int index, int[] candidates, int target, List<Integer> combination, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0 || index == candidates.length) return;

        combination.add(candidates[index]);
        solve(index + 1, candidates, target - candidates[index], combination, result);
        combination.remove(combination.size() - 1);


        int next=index+1;
        while (next<candidates.length && candidates[next]==candidates[index]) next++;
        solve(next,candidates,target,combination,result);
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        //  Time Complexity (TC): O(n log n +  2^n)
        //  Space Complexity (SC): O(n + k*n)  n= recursion stack   k*n because for copying all element from combination to result when target become 0

        Arrays.sort(candidates);

        List<List<Integer>> result=new ArrayList<>();

        solve(0,candidates,target,new ArrayList<>(),result);

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->40

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates,target));
    }
}
