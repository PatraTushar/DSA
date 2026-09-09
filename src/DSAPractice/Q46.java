package DSAPractice;

import java.util.HashMap;

public class Q46 {

    static int subArraySumEqualsK(int[] arr, int k) {

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;

        map.put(sum, 1);

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (map.containsKey(sum - k)) count += map.get(sum - k);

            if (map.containsKey(sum)) map.put(arr[i], map.get(arr[i]) + 1);

            else map.put(sum, 1);

        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        System.out.println(subArraySumEqualsK(arr, k));
    }
}
