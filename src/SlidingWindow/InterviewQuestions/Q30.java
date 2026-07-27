package SlidingWindow.InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class Q30 {

    static int countCompleteSubArrays(int[] num) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)


        int n = num.length;

        HashSet<Integer> set = new HashSet<>();

        for (int ele : num) {
            set.add(ele);
        }

        int totalUniqueElement = set.size();

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;

        for (int right = 0; right < n; right++) {

            // Expand the window
            map.put(num[right], map.getOrDefault(num[right], 0) + 1);

            while (map.size() == totalUniqueElement) {

                // count all valid subarray
                result += (n - right);

                map.put(num[left], map.get(num[left]) - 1);

                if (map.get(num[left])==0) map.remove(num[left]);

                left++;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->2799

        int[] num = {1, 3, 1, 2, 2};
        System.out.println(countCompleteSubArrays(num));


    }
}
