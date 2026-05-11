package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Q32 {

    static int[] findLps(String s) {

        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int length = 0;

        int i = 1;

        while (i < n) {

            if (s.charAt(i) == s.charAt(length)) {

                length++;
                lps[i] = length;
                i++;
            } else {

                if (length != 0) length = lps[length - 1];

                else {

                    lps[i] = 0;
                    i++;
                }
            }

        }

        return lps;
    }


    static List<Integer> kmp(String txt, String pattern) {

        int m = txt.length();
        int n = pattern.length();
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();
        int[] lps = findLps(pattern);
        while (i < m) {

            if (txt.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == n) {

                result.add(i - j);
                j = lps[j - 1];

            } else if (i < m && txt.charAt(i) != pattern.charAt(j)) {

                if (j != 0) j = lps[j - 1];

                else i++;


            }
        }

        return result;


    }

    static List<Integer> beautifulIndices(String s, String a, String b, int k) {

        // leeTCode->3006

        // Time Complexity: O(s+a+b)
        // Space Complexity: O(s+a+b)

        // s → main string length
        //a → pattern a length
        //b → pattern b length

        List<Integer> aOccurrence = new ArrayList<>();

        List<Integer> bOccurrences = new ArrayList<>();

        aOccurrence = kmp(s, a);
        bOccurrences = kmp(s, b);

        List<Integer> result = new ArrayList<>();


        int j = 0;

        for (int i = 0; i < aOccurrence.size(); i++) {

            int aIdx = aOccurrence.get(i);

            // STEP 1: ensure j >= i - k
            while (j < bOccurrences.size() && bOccurrences.get(j) < aIdx - k) {
                j++;
            }

            // STEP 2: check j <= i + k
            if (j < bOccurrences.size() && bOccurrences.get(j) <= aIdx + k) {
                result.add(aIdx);
            }
        }

        return result;





    }

    public static void main(String[] args) {

        String s = "isawsquirrelnearmysquirrelhouseohmy";
        String a = "my";
        String b = "squirrel";
        int k = 15;

        List<Integer> result = beautifulIndices(s, a, b, k);
        System.out.println(result);


    }
}
