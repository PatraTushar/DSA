package ARRAYS.strivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q19 {

    static List<Integer> majorityElement2(int[] nums) {   // better approach

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (int a : map.keySet()) {
            if (map.get(a) > n / 3) {

                list.add(a);

            }
        }

        return list;


    }

    static List<Integer> majorityElementII(int[] arr) {  // optimal approach

        // Time Complexity: O(n)
        //Space Complexity: O(1)

        int n = arr.length;
        int ele1 = 0;
        int count1 = 0;
        int ele2 = 0;
        int count2 = 0;
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {

            if (num == ele1) {

                count1++;


            } else if (num == ele2) {

                count2++;
            } else if (count1 == 0) {

                ele1 = num;
                count1++;
            } else if (count2 == 0) {

                ele2 = num;
                count2++;
            } else {

                count1--;
                count2--;
            }

        }


        count1 = 0;
        count2 = 0;

        for (int num : arr) {

            if (num == ele1) count1++;
            if (num == ele2) count2++;
        }

        int majority = n / 3;

        if (count1 > majority) result.add(ele1);
        if (count2 > majority) result.add(ele2);


        return result;


    }


    public static void main(String[] args) {

        // majority element II

        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> ans = majorityElement2(arr);
        System.out.println(ans);

        List<Integer> ans1 = majorityElementII(arr);
        System.out.println(ans1);


    }
}
