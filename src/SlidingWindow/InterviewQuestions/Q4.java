package SlidingWindow.InterviewQuestions;

import java.util.HashMap;

public class Q4 {

    static String minWindow(String s,String t){


        //  Time Complexity: O(m)+O(n)=O(m+n)
        //  Space Complexity: O(n)



        int m = s.length();
        int n = t.length();
        int minLength = Integer.MAX_VALUE;
        int startingIndex = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int need = 0;

        for (int i = 0; i < n; i++) {

            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        for (int right = 0; right < m; right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {

                if (map.get(ch) > 0) need++;

                map.put(ch, map.get(ch) - 1);


            }


            while (need == n) {

                int length = right - left + 1;

                if (length < minLength) {

                    minLength = length;
                    startingIndex = left;
                }


                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);

                    if (map.get(s.charAt(left)) > 0) need--;

                }


                left++;


            }


        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startingIndex, minLength + startingIndex);
    }

    public static void main(String[] args) {

        // leeTCode->76


        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));





    }
}
