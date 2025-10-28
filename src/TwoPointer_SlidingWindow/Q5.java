package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class Q5 {


    // BRUTE FORCE APPROACH
    static int lengthOfLongestSubstring(String s) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(n  )

        int maxLength = 0;

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) == 1) {

                    int length = j - i + 1;
                    maxLength = Math.max(length, maxLength);

                }

                if (map.get(ch) > 1) {

                    map.clear();
                    break;
                }

            }


        }

        return maxLength;


    }

    // OPTIMAL APPROACH

    static int lengthOfLongestSubstringI(String s) {


        //  Time Complexity: O(n)
        //  Space Complexity: O(n)


        int maxLength = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            if (!map.isEmpty() && (map.containsKey(ch) && map.get(ch) >= left)) {

                left = map.get(ch) + 1;
                map.put(ch, right);


            } else {

                map.put(ch, right);


            }

            int length = right - left + 1;
            maxLength = Math.max(length, maxLength);


        }

        return maxLength;


    }


    public static void main(String[] args) {

        // leeTCode->3

        String str = "cadbzabcd";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(lengthOfLongestSubstringI(str));
    }
}
