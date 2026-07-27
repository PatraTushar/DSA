package SlidingWindow.InterviewQuestions;

import java.util.HashMap;

public class Q29 {

    static long countGood(int[] num, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)


        int n = num.length;
        long result = 0;
        long pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        int left = 0;
        for (int right = 0; right < n; right++) {

            // expand the window
            pairs += map.getOrDefault(num[right], 0);
            map.put(num[right], map.getOrDefault(num[right], 0) + 1);

            while (pairs >= k) {

                // Every subarray ending from right to n-1 is valid
                result += (n - right);


                map.put(num[left], map.get(num[left]) - 1);

                // Remove the pairs contributed by num[left]
                pairs -= map.get(num[left]);

                left++;


            }


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->2537

        int[] num = {3, 1, 4, 3, 2, 2, 4};
        int k = 10;
        System.out.println(countGood(num, k));


    }

    }
