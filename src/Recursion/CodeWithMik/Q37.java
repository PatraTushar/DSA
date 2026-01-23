package Recursion.CodeWithMik;

import java.util.HashMap;

public class Q37 {

    static int dfs(int[] nums, int k, int index, HashMap<Integer, Integer> freq) {

        if (index == nums.length) {

            if (freq.size() == 0) return 0;
            return 1;
        }


        int pick = 0;
        int element1 = nums[index] + k;
        int element2 = nums[index] - k;

        if (freq.size() == 0 || (!freq.containsKey(element1)) && !freq.containsKey(element2)) {
            // include
            freq.put(nums[index], freq.getOrDefault(nums[index], 0) + 1);

            // explore
            pick = dfs(nums, k, index + 1, freq);

            // backtrack
            freq.put(nums[index], freq.get(nums[index])-1);

            if (freq.get(nums[index]) == 0) {

                freq.remove(nums[index]);
            }
        }

        int notPick = dfs(nums, k, index + 1, freq);
        return pick + notPick;


    }


    static int beautifulSubsets(int[] nums, int k) {

        return dfs(nums,k,0,new HashMap<>());


    }


    public static void main(String[] args) {

        int[] nums = {2, 4, 6};
        int k = 2;
        System.out.println(beautifulSubsets(nums,k));

    }
}
