package SlidingWindow.InterviewQuestions;

import java.util.HashMap;

public class Q15 {

    static int maxSubArrayLength(int[] num, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n) (worst case, if all elements are distinct)


        int n = num.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int result = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            map.put(num[right], map.getOrDefault(num[right],0) + 1);

            while (map.get(num[right]) > k) {

                map.put(num[left],map.get(num[left])-1);
                left++;




            }

            result=Math.max(result,right-left+1);

        }

        return result;
    }

    public static void main(String[] args) {

        // leeTCode->2958

        int[] num = {1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;
        System.out.println(maxSubArrayLength(num,k));
    }
}
