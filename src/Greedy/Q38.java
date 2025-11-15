package Greedy;

import java.util.HashMap;
import java.util.HashSet;

public class Q38 {

    static int maxCount(int[] banned, int n, int maxSum) {

        //  Time Complexity: O( length + n)
        //  Space Complexity: O(length)

        int length = banned.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < length; i++) {

            set.add(banned[i]);
        }

        int maxNumber = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (!set.contains(i) && sum + i <= maxSum) {

                maxNumber++;
                sum += i;
            }
        }

        return maxNumber;


    }


    public static void main(String[] args) {

        // leeTCode->2554

        int[] banned = {1, 6, 5};
        int n = 5;
        int maxSum = 6;
        System.out.println(maxCount(banned, n, maxSum));

    }
}
