package ARRAYS.strivers;

import java.util.Arrays;

public class Q15 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {

            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int findGreaterClosest(int[] arr, int index) {

        int n = arr.length;

        if (index <= 0 || index >= n) return -1;
        int target = arr[index - 1];
        int closest = Integer.MAX_VALUE;
        int closestIndex = -1;

        for (int j = index; j < n; j++) {

            if (arr[j] > target && arr[j] <= closest) {

                closest = arr[j];
                closestIndex = j;
            }


        }

        return closestIndex;


    }


    static void nextPermutation(int[] nums) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = nums.length;
        int breakPoint = -1;

        for (int i = n - 1; i > 0; i--) {

            if (nums[i] > nums[i - 1]) {           // If nums[i] > nums[i-1], it means this permutation has a next greater permutation.

                breakPoint = i;
                break;

            }
        }


        if (breakPoint != -1) {

            int swappingIndex = findGreaterClosest(nums, breakPoint);

            swap(nums, breakPoint - 1, swappingIndex);

            reverse(nums, breakPoint, n - 1);
        } else {

            reverse(nums, 0, n - 1);
        }

        System.out.println(Arrays.toString(nums));


    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 2};
        nextPermutation(arr);
    }
}
