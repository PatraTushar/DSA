package Greedy;

public class Q35 {

    static int minPatches(int[] nums, int n) {

        //  Time Complexity: O(length + log n)
        //  Space Complexity: O(1)


        int length = nums.length;
        int patches = 0;
        long maxReachable = 0;
        int i = 0;

        while (maxReachable < n) {

            if (i < length && nums[i] <= maxReachable + 1) {

                maxReachable += nums[i];
                i++;
            } else {

                maxReachable += (maxReachable + 1);
                patches++;
            }
        }

        return patches;


    }

    public static void main(String[] args) {

        // leeTCode->330

        int[] arr = {1, 3};
        int n = 6;
        System.out.println(minPatches(arr, n));


    }
}
