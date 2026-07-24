package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q21 {

    static boolean checkInclusion(String s1, String s2) {

        // Time Complexity (TC): O(m+n)
        //Space Complexity (SC): O(1)


        int m = s1.length();
        int n = s2.length();

        if (m > n) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];


        for (int i = 0; i < m; i++) {

            char ch = s1.charAt(i);
            s1Freq[ch - 'a']++;
        }


        int left = 0;

        for (int right = 0; right < n; right++) {

            char ch = s2.charAt(right);

            s2Freq[ch - 'a']++;

            while (right - left + 1 > m) {

                char leftChar = s2.charAt(left);

                s2Freq[leftChar - 'a']--;
                left++;
            }


            if (right - left + 1 == m) {

                if (Arrays.equals(s1Freq,s2Freq)) return true;
            }

        }

        return false;


    }

    public static void main(String[] args) {

        // leeTCode->567

        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
