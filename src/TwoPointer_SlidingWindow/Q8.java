package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class Q8 {


    // BRUTE FORCE APPROACH
    static int KLongestSubstring(String s, int k) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(k)

        int n = s.length();
        int longest = 0;

        for (int i = 0; i < n; i++) {

            HashMap<Character, Integer> map = new HashMap<>();
            int left = i;

            for (int j = i; j < n; j++) {

                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                while (map.size() > k) {


                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                    if (map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));


                    left++;

                }

                longest = Math.max(longest, j - left + 1);


            }

        }

        return longest;
    }

    // OPTIMAL APPROACH

    static int KLongestSubstringI(String s, int k) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(k)

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                if (map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));

                left++;


            }

            longest = Math.max(longest, right - left + 1);

        }

        return longest;

    }

    public static void main(String[] args) {

        // leeTCode->340

        String s = "aaabbccd";
        int k = 2;
        System.out.println(KLongestSubstring(s, k));
        System.out.println(KLongestSubstringI(s, k));


    }
}
