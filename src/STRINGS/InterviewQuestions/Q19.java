package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q19 {

    static boolean isSubsequence(String s, String t) {

        // Time Complexity:  O(n)
        // Space Complexity: O(1)

        int m = s.length();
        int n = t.length();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (s.charAt(i) == t.charAt(j)) i++;

            j++;
        }

        return i == m;


    }




    public static int numMatchingSubseq(String s, String[] words) {

        // leeTCode->792

        // Time Complexity:  O(n + Σ (word_length × log n))
        // Space Complexity: O(n)

        // n = length of s (preprocessing)
        //For each character in each word → binary search (log n)



        // Step 1: Preprocess s
        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, new ArrayList<>());
            }

            map.get(ch).add(i);
        }

        int count = 0;

        // Step 2: Check each word
        for (String word : words) {

            int prevIndex = -1;
            boolean isSubseq = true;

            for (char ch : word.toCharArray()) {

                // If character not present at all
                if (!map.containsKey(ch)) {
                    isSubseq = false;
                    break;
                }

                List<Integer> list = map.get(ch);

                // Binary search → find index > prevIndex
                int nextIndex = findNextIndex(list, prevIndex);

                if (nextIndex == -1) {
                    isSubseq = false;
                    break;
                }

                prevIndex = nextIndex;
            }

            if (isSubseq) count++;
        }

        return count;
    }



    // Binary Search: find smallest element > prevIndex
    private static int findNextIndex(List<Integer> list, int prevIndex) {

        int left = 0, right = list.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) > prevIndex) {
                ans = list.get(mid);
                right = mid - 1; // try smaller valid index
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        //leeTCode->392

        String s = "abc";
        String t = "ahbgdc";
        String s1 = "aabc";
        String t1 = "ahabgdc";

        System.out.println(isSubsequence(s, t));
        System.out.println(isSubsequenceI(s1, t1));


    }
}
