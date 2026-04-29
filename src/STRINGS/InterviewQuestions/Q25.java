package STRINGS.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q25 {

    static int countPalindromicSubsequence(String s) {

        // Time Complexity: O(26*n)=O(n)
        // Space Complexity: O(26) = O(1)


        int n = s.length();

        HashSet<Character> letters = new HashSet<>();

        for (int i = 0; i < n; i++) {

            letters.add(s.charAt(i));
        }

        int result = 0;

        for (char letter : letters) {

            int leftMostIndex = -1;
            int rightMostIndex = -1;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == letter) {

                    if (leftMostIndex == -1) leftMostIndex = i;

                    rightMostIndex = i;
                }


            }

            HashSet<Character> set = new HashSet<>();

            for (int middle = leftMostIndex + 1; middle <= rightMostIndex - 1; middle++) {

                set.add(s.charAt(middle));


            }

            result += set.size();


        }

        return result;

    }


    static int countPalindromicSubsequenceI(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(26) = O(1)

        int n = s.length();

        int[] leftMostIndex = new int[26];
        int[] rightMostIndex = new int[26];

        Arrays.fill(leftMostIndex, -1);
        Arrays.fill(rightMostIndex, -1);


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            int index = ch - 'a';

            if (leftMostIndex[index] == -1) {

                leftMostIndex[index] = i;
            }

            rightMostIndex[index] = i;


        }

        int result=0;

        for (int i = 0; i < 26; i++) {

            if (leftMostIndex[i] == -1) continue;

            HashSet<Character> set = new HashSet<>();


            for (int middle = leftMostIndex[i] + 1; middle < rightMostIndex[i]; middle++) {
                set.add(s.charAt(middle));

            }

            result+=set.size();



        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->1930

        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
}
