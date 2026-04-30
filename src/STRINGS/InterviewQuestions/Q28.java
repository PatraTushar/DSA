package STRINGS.InterviewQuestions;

import java.util.HashMap;

public class Q28 {

    static int subArraySumEqualsZero(int[] arr) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {

                count += map.get(prefixSum);

            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }

        return count;


    }


    static void beautifulSubstrings(String s, int k) {


    }


    public static void main(String[] args) {

        // leeTCode->2949

        String s = "baeyh";
        int k = 2;
       // System.out.println(beautifulSubstrings(s, k));


        int[] arr={6,-1,-3,4,-2,2,4,6,-12,-7};
        System.out.println(subArraySumEqualsZero(arr));

    }
}
