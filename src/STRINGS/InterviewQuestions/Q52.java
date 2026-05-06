package STRINGS.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q52 {

    static int maximumLength(String s) {

        // brute force approach

        // Time Complexity: O(n^3)
        // Space Complexity: O(n^3)

        HashMap<String, Integer> map = new HashMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {


            for (int j = i; j < n; j++) {

                if (s.charAt(j) == s.charAt(i)) {

                    String substring = s.substring(i, j + 1);
                    map.put(substring, map.getOrDefault(substring, 0) + 1);
                } else break;


            }


        }

        int longest = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() >= 3) {

                longest = Math.max(longest, entry.getKey().length());
            }


        }

        return longest == 0 ? -1 : longest;
    }


    static int maximumLengthI(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(26*n)~O(n)

        // optimal approach

        int n = s.length();
        int[][] matrix = new int[26][n + 1];
        char prevChar = s.charAt(0);
        int length = 0;

        for (int i = 0; i < n; i++) {

            char currChar = s.charAt(i);

            if (currChar == prevChar) {

                length++;
                matrix[currChar - 'a'][length]++;
            } else {

                length = 1;
                matrix[currChar - 'a'][length]++;
                prevChar = currChar;
            }


        }

        int result = 0;

        for (int i = 0; i < 26; i++) {

            int cumulativeSum = 0;

            for (int j = n; j >= 1; j--) {

                cumulativeSum += matrix[i][j];

                if (cumulativeSum >= 3) {

                    result = Math.max(result, j);
                    break;
                }


            }
        }

        return result == 0 ? -1 : result;


    }

    public static void main(String[] args) {

        // leeTCode->2981 and 2982

        String s = "aaaa";
        System.out.println(maximumLength(s));
    }
}
