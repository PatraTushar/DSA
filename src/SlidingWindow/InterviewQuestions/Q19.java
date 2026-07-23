package SlidingWindow.InterviewQuestions;

import java.util.TreeMap;

public class Q19 {

    static int longestSubArray(int[] nums, int limit) {

        // Time Complexity (TC): O(nlogn)
        //Space Complexity (SC): O(n)

        int n = nums.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.lastKey() - map.firstKey() > limit) {

                map.put(nums[left], map.get(nums[left])-1);

                if (map.get(nums[left])==0) map.remove(nums[left]);



                left++;

            }

            maxLength=Math.max(maxLength,right-left+1);
        }

        return maxLength;


    }

    public static void main(String[] args) {

        // leeTCode->1438

        int[] num = {8, 2, 4, 7};
        int limit = 4;

        System.out.println(longestSubArray(num, limit));
    }
}
