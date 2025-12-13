package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.List;

public class Q9 {

    static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void generatePermutation(int[] num, int n, List<List<Integer>> result, int idx) {

        if (idx == n) {

            List<Integer> temp = new ArrayList<>();

            for (int ele : num) {

                temp.add(ele);
            }

            result.add(temp);
            return;
        }

        for (int choices = idx; choices < n; choices++) {

            swap(num, idx, choices);
            generatePermutation(num, n, result, idx + 1);
            swap(num, idx, choices);


        }


    }


    static List<List<Integer>> permutation(int[] nums) {

        //  Time Complexity: O(n × n!)
        //  Space Complexity: O(n × n!)

        List<List<Integer>> result = new ArrayList<>();
        generatePermutation(nums, nums.length, result, 0);


        return result;


    }


    public static void main(String[] args) {

        // leeTCode->46

        int[] num = {1, 2, 3};
        List<List<Integer>> ans = permutation(num);
        System.out.println(ans);

    }
}
