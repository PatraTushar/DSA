package SlidingWindow.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    static boolean allZero(int[] freq) {

        for (int ele : freq) {

            if (ele != 0) return false;
        }

        return true;
    }


    static List<Integer> findAnagrams(String s, String p) {

        // Time Complexity: O(m*26)~O(m)
        // Space Complexity: O(k)   where k is the number of anagram starting indices stored in the result list.

        int n = p.length();
        int[] freq = new int[26];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            char ch = p.charAt(i);
            freq[ch - 'a']++;
        }


        int left = 0;
        int m = s.length();


        for (int right = 0; right < m; right++) {

            int index = s.charAt(right) - 'a';
            freq[index]--;

            if (right - left + 1 == n) {

                if (allZero(freq)) result.add(left);

                freq[s.charAt(left) - 'a']++;
                left++;

            }


        }


        return result;


    }


    public static void main(String[] args) {

        // leeTCode->438

        String s="cbaebabacd";
        String p="abc";
        List<Integer> ans=findAnagrams(s,p);
        System.out.println(ans);


    }
}
