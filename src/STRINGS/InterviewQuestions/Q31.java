package STRINGS.InterviewQuestions;

import java.util.Map;

public class Q31 {

    static int minSteps(String s, String t) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        // using 2 array

        int n = s.length();
        int[] freq_s = new int[26];
        int[] freq_t = new int[26];

        for (int i = 0; i < n; i++) {

            freq_s[s.charAt(i) - 'a']++;
            freq_t[t.charAt(i) - 'a']++;
        }


        int result = 0;

        for (int i = 0; i < 26; i++) {

            if (freq_s[i] > freq_t[i]) {

                int diff = freq_s[i] - freq_t[i];
                result += diff;
            }
        }

        return result;


    }


    static int minStepsI(String s, String t) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        // using one array

        int n = s.length();
        int[] freq_s = new int[26];


        for (int i = 0; i < n; i++) {

            freq_s[s.charAt(i) - 'a']++;
            freq_s[t.charAt(i) - 'a']--;
        }


        int result = 0;

        for (int i = 0; i < 26; i++) {
            result+= Math.max(0,freq_s[i]);
        }

        return result;


    }


    public static void main(String[] args) {

        // leeTCode->1347

        String s = "bab";
        String t = "aba";
        System.out.println(minSteps(s, t));
        System.out.println(minStepsI(s, t));
    }
}
