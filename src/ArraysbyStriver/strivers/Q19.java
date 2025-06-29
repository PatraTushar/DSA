package ArraysbyStriver.strivers;

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

    static List<Integer> majorityElementII(int[] nums) {  // optimal approach

       // Time Complexity: O(n)
        //Space Complexity: O(1)

        int n= nums.length;
        List<Integer> result = new ArrayList<>();


        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (count1 == 0 && nums[i] != element2) {
                count1++;
                element1 = nums[i];

            } else if (count2 == 0 && nums[i] != element1) {
                count2++;
                element2 = nums[i];

            } else if (element1 == nums[i]) {
                count1++;
            } else if (element2 == nums[i]) {
                count2++;

            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i=0;i<nums.length;i++){

            if(element1==nums[i]) count1++;
            if(element2==nums[i]) count2++;

        }

        int min=n/3;

        if(count1>min)result.add(element1);
        if(count2>min)result.add(element2);

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
