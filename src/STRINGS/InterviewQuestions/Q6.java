package STRINGS.InterviewQuestions;

import java.util.Arrays;

public class Q6 {

    // Time Complexity:   k == 1 → O(n²)    k > 1 → O(n log n)
    // Space Complexity: O(n)

    static String orderlyQueue(String s, int k) {

        String result = s;

        if (k == 1) {



            for (int i = 1; i < s.length(); i++) {

                String rotated = s.substring(i) + s.substring(0, i);

                if (rotated.compareTo(result) < 0) {

                    result=rotated;
                }

            }


        } else {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->899

        String s = "baaca";
        int k = 3;
        String ans = orderlyQueue(s, k);
        System.out.println(ans);
    }
}
