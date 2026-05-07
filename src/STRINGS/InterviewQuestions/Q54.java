package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q54 {

    static int[] minOperations(String boxes) {

        // Time Complexity: O(n^2)
        // Space Complexity: O(n)

        int n = boxes.length();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (boxes.charAt(i) == '1') set.add(i);

        }

        int[] result = new int[n];


        for (int i = 0; i < n; i++) {

            for (int idx : set) {

                result[i] += Math.abs(i - idx);

            }
        }

        return result;

    }

    static int[] minOperationI(String boxes) {


        // Time Complexity: O(n+n)~O(n)
        // Space Complexity: O(n)

        int n = boxes.length();

        int[] result = new int[n];

        int cumulativeValue = 0;
        int cumulativeSumValue = 0;

        for (int i = 0; i < n; i++) {

            result[i] = cumulativeSumValue;

            cumulativeValue += boxes.charAt(i) == '1' ? 1 : 0;
            cumulativeSumValue += cumulativeValue;


        }


        cumulativeValue = 0;
        cumulativeSumValue = 0;

        for (int i = n - 1; i >= 0; i--) {


            result[i] += cumulativeSumValue;

            cumulativeValue += boxes.charAt(i) == '1' ? 1 : 0;
            cumulativeSumValue += cumulativeValue;


        }


        return result;


    }


    public static void main(String[] args) {

        // leeTCode->1769

        String boxes = "001011";
        int[] result = minOperationI(boxes);
        System.out.println(Arrays.toString(result));


    }
}
