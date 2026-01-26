package Recursion.CodeWithMik;

import java.util.HashMap;

public class Q37 {

    //  Time Complexity (TC): O(2^n)
    //  Space Complexity (SC): O(n)



    static int beautifulSubsets(int[] nums, int k) {
        return dfs(nums, k, 0, new HashMap<>());
    }

  static int dfs(int[] nums, int k, int idx, HashMap<Integer, Integer> freq) {

        // Base case: all elements processed
        if (idx == nums.length) {
            // empty subset is NOT allowed
            return freq.isEmpty() ? 0 : 1;
        }

        int count = 0;

        // ---------------- NOT TAKE ----------------
        count += dfs(nums, k, idx + 1, freq);

        // ---------------- TAKE ----------------
        int val = nums[idx];

        if (!freq.containsKey(val - k) && !freq.containsKey(val + k)) {

            freq.put(val, freq.getOrDefault(val, 0) + 1);

            count += dfs(nums, k, idx + 1, freq);

            // backtrack
            freq.put(val, freq.get(val) - 1);
            if (freq.get(val) == 0) freq.remove(val);
        }

        return count;
    }


    public static void main(String[] args) {

        // leeTCode->2597

        int[] nums = {2, 4, 6};
        int k = 2;
        System.out.println(beautifulSubsets(nums, k));

    }
}
