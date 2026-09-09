package DSAPractice;

import java.util.HashMap;

public class Q45 {

    static int longestSubArrSumK(int[] arr, int k) {

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum - k == 0) {

                maxLength = Math.max(maxLength, i + 1);

            } else if (map.containsKey(sum - k)) {

                int length = i - map.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) map.put(sum, i);

        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        System.out.println(longestSubArrSumK(arr, 3));
    }
}
