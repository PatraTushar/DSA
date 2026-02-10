package ArraysbyStriver.strivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q11 {

    static List<Integer> majorityElement(int[] nums) {   // better approach

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
            if (map.get(a) > n / 2) {

                list.add(a);

            }
        }

        return list;


    }

    static int majorityElementI(int[] arr) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        int majority = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == majority) count++;

            else {

                count--;

                if (count == 0) {

                    majority = arr[i];
                    count = 1;
                }
            }


        }

        return majority;

    }

    public static void main(String[] args) {

        // majority element (leeTCode-->169)

        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElementI(arr));
    }
}
