package BitManipulation.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q4 {


    // BRUTE FORCE APPROACH
    static int singleNumberII(int[] arr) {

        //  Time Complexity: O(n + k )   where k is the number of unique element in the map
        //  Space Complexity: O(k)

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }


        for (int key : map.keySet()) {

            if (map.get(key) == 1) return key;
        }

        return -1;

    }

    // OPTIMAL SOLUTION
    static int singleNumber2(int[] arr) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        int n = arr.length;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < n; i++) {

            ones = (ones ^ arr[i]) & (~twos);
            twos = (twos ^ arr[i]) & (~ones);

        }

        return ones;

    }


    static int singleNumber02(int[] arr) {

        //  Time Complexity: O(n log n)
        //  Space Complexity: O(1)

        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 1; i < n; i = i + 3) {

            if (arr[i] != arr[i - 1]) return arr[i - 1];


        }

        return arr[n-1];
    }


    public static void main(String[] args) {

        // leeTCode->137

        int[] arr = {5, 5, 5, 2, 4, 4, 4};
        System.out.println(singleNumberII(arr));
        System.out.println(singleNumber2(arr));
        System.out.println(singleNumber02(arr));


    }
}
